package StockTrackingApplication.StocksTradingMethods;

import StockTrackingApplication.Stocks.Quote;

public class TrueRange {


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
    public double getTrueRange (Quote quote) {
        return Math.max(rangeOne(quote), Math.max(rangeTwo(quote), rangeThree(quote)));
    }
}