package com.stockTradingMethods.vwap;

import com.stocks.Quote;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class VwapCalculatorTest {

    @Test
    void testVwapCalculator() {
        VwapCalculator vwapCalculator = new VwapCalculator();
        Quote quote = new Quote("symbol", 1,2,3,4,5, "latestTradingDay",6,7,"changePercent");
        vwapCalculator.getVwap(quote);
        Assertions.assertNotNull(quote);
        Assertions.assertEquals(4, vwapCalculator.getVwap(quote));
    }
}