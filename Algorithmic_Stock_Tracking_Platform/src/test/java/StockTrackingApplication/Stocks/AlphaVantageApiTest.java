package StockTrackingApplication.Stocks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlphaVantageApiTest {

    @Test
    void testAlphaVantageApi () throws QuoteNotFoundException {
        AlphaVantageApi alphaVantageApi = new AlphaVantageApi();
        Quote quote = alphaVantageApi.getQuote("MSFT");
        Assertions.assertNotNull(quote);
        System.out.println(quote);
    }

}