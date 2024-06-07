package com.stockTradingMethods.trueRange;

import com.stocks.Quote;

import java.text.DecimalFormat;

public class TrueRange {

    DecimalFormat decimalFormat = new DecimalFormat("0.00");

    public double getHighPrice (Quote highPrice) {
        return highPrice.getHigh();
    }
    public double getLowPrice (Quote lowPrice) {
        return lowPrice.getLow();
    }
    public double getOpenPrice (Quote openPrice) {
        return openPrice.getOpen();
    }

    public double rangeOne (Quote quote) {
        return getHighPrice(quote) - getLowPrice(quote);
    }
    public double rangeTwo (Quote quote) {
        return getHighPrice(quote) - getOpenPrice(quote);
    }
    public double rangeThree (Quote quote) {
        return getLowPrice(quote) - getOpenPrice(quote);
    }
    public String getTrueRange (Quote quote) {
     return decimalFormat.format(Math.max(rangeOne(quote), Math.max(rangeTwo(quote), rangeThree(quote))));
    }
}
