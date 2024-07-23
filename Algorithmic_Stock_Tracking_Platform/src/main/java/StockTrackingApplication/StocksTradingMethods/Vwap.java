package StockTrackingApplication.StocksTradingMethods;

import StockTrackingApplication.Stocks.Quote;

public class Vwap {

    public double getPrice (Quote price) {
        return price.getPrice();
    }
    public int getVolume (Quote volume) {
        return volume.getVolume();
    }
    public double getVwap (Quote quote) {
        return getPrice(quote) * getVolume(quote) / getVolume(quote);
    }
}
