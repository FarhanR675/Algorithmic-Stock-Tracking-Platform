package StockTrackingApplication.Stocks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MapQuoteCacheTest {

    // Testing both methods of MapQuoteClass
    @Test
    void testMapQuoteCache () {
        MapQuoteCache mapQuoteCache = new MapQuoteCache();
        mapQuoteCache.addQuote(new Quote("symbol", 1, 2, 3, 4, 5, "latestTradingDay", 6, 7, "changePercent"));
        Quote quote = mapQuoteCache.getQuote("symbol");
        Assertions.assertNotNull(quote);
        Assertions.assertEquals("latestTradingDay", quote.getLatestTradingDay());

    }
}