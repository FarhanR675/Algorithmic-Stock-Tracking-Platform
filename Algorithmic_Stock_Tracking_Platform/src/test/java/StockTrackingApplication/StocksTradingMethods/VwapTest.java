package StockTrackingApplication.StocksTradingMethods;

import StockTrackingApplication.Stocks.Quote;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class VwapTest {

    @Test
    void testVwap() {
        Vwap vwap = new Vwap();
        Quote quote = new Quote("symbol", 1,2,3,4,5, "latestTradingDay",6,7,"changePercent");
        vwap.getVwap(quote);
        Assertions.assertNotNull(quote);
        Assertions.assertEquals(4, vwap.getVwap(quote));
    }
}