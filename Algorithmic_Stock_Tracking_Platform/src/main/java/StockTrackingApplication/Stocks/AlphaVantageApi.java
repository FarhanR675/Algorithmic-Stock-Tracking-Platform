package StockTrackingApplication.Stocks;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class AlphaVantageApi {

        private static final String API_URL = "https://www.alphavantage.co/query?function=GLOBAL_QUOTE&symbol={symbol}&apikey={apikey}";
        private final String API_KEY = "3SHP3KMU0SJZPNL4";
        private final ObjectMapper objectMapper = new ObjectMapper();

        public Quote getQuote(String symbol) throws QuoteNotFoundException {
            String url = API_URL.replace("{symbol}", symbol)
                    .replace("{apikey}", API_KEY);
            HttpClient httpClient = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder().
                    uri(URI.create(url))
                    .build();
            Quote quote = new Quote();
            try {
                HttpResponse<String> response =
                        httpClient.send(request, HttpResponse.BodyHandlers.ofString());
                httpClient.close();
                if (response.statusCode() == 200) {
                    JsonNode jsonNode = objectMapper.readTree(response.body());
                    JsonNode globalQuote = jsonNode.get("Global Quote");
                    quote = objectMapper.treeToValue(globalQuote, Quote.class);
                }
            } catch (Exception e) {
                throw new QuoteNotFoundException("Quote not found, reason: " + e.getMessage());
            }
            return quote;
        }
}
