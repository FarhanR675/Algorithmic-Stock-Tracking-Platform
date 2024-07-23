package StockTrackingApplication.Stocks;

import java.util.HashMap;
import java.util.Map;

public class MapQuoteCache implements QuoteCache {
    Map<String, Quote> quotes;

    public MapQuoteCache() {
        this.quotes = new HashMap<>();
    }
    @Override
    public Quote getQuote (String symbol) {
        return quotes.get(symbol);
    }
    @Override
    public void addQuote (Quote quote) {
        quotes.put(quote.getSymbol(), quote);
    }
}
