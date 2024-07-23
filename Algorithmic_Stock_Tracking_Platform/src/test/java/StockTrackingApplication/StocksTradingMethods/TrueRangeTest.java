package StockTrackingApplication.StocksTradingMethods;

import StockTrackingApplication.Stocks.Quote;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TrueRangeTest {
    @Test
    void testTrueRange () {
        TrueRange trueRange = new TrueRange();
        Quote quote = new Quote("Symbol", 1 , 2 , 3, 4, 5, "latestTradingDay", 6, 7, "changePercent");
        trueRange.getTrueRange(quote);
        Assertions.assertNotNull(trueRange);
        Assertions.assertEquals(2, trueRange.getTrueRange(quote));

    }
}
//H - L = -1
//H - O = 1
//L - O = 2