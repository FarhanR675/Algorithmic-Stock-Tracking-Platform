package com.stockTradingMethods.vwap;

import com.stocks.Quote;

public class VwapCalculator {

    // VWAP = CLOSING PRICE * VOLUME = TOTAL / VOLUME = Vwap

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