package StockTrackingApplication.Stocks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuoteTest {

    @Test
    void testQuote () {
        Quote quote = new Quote("Symbol", 1, 2, 3, 4, 5, "latestTradingDay", 6 , 7, "changePercent");
        Assertions.assertNotNull(quote);
        Assertions.assertEquals(6, quote.getPreviousClose());
    }
}