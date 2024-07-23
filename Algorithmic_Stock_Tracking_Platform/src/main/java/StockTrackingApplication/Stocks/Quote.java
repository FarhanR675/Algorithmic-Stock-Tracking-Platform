package StockTrackingApplication.Stocks;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

 @JsonIgnoreProperties(ignoreUnknown = true)
    public class Quote {
        @JsonProperty("01. symbol")
        private String symbol;
        @JsonProperty("02. open")
        private double open;
        @JsonProperty("03. high")
        private double high;
        @JsonProperty("04. low")
        private double low;
        @JsonProperty("05. price")
        private double price;
        @JsonProperty("06. volume")
        private int volume;
        @JsonProperty("07. latest trading day")
        private String latestTradingDay;
        @JsonProperty("08. previous close")
        private double previousClose;
        @JsonProperty("09. change")
        private double change;
        @JsonProperty("10. change percent")
        private String changePercent;

        public Quote () {
        }

        public Quote(String symbol,
                     double open,
                     double high,
                     double low,
                     double price,
                     int volume,
                     String latestTradingDay,
                     double previousClose,
                     double change,
                     String changePercent) {

            this.symbol = symbol;
            this.open = open;
            this.high = high;
            this.low = low;
            this.price = price;
            this.volume = volume;
            this.latestTradingDay = latestTradingDay;
            this.previousClose = previousClose;
            this.change = change;
            this.changePercent = changePercent;
        }
        public String getSymbol () {
            return symbol;
        }
        public void setSymbol (String symbol) {
            this.symbol = symbol;
        }
        public double getOpen () {
            return open;
        }
        public void setOpen (double open) {
            this.open = open;
        }
        public double getHigh () {
            return high;
        }
        public void setHigh (double high) {
            this.high = high;
        }
        public double getLow () {
            return low;
        }
        public void setLow (double low) {
            this.low = low;
        }
        public double getPrice () {
            return price;
        }
        public void setPrice (double price) {
            this.price = price;
        }
        public int getVolume () {
            return volume;
        }
        public void setVolume (int volume) {
            this.volume = volume;
        }
        public String getLatestTradingDay () {
            return latestTradingDay;
        }
        public void setLatestTradingDay (String latestTradingDay) {
            this.latestTradingDay = latestTradingDay;
        }
        public double getPreviousClose () {
            return previousClose;
        }
        public void setPreviousClose (double previousClose) {
            this.previousClose = previousClose;
        }
        public double getChange () {
            return change;
        }
        public void setChange (double change) {
            this.change = change;
        }
        public String getChangePercent () {
            return changePercent;
        }
        public void setChangePercent (String changePercent) {
            this.changePercent = changePercent;
        }

        @Override
        public String toString() {
            return "\n" +
                    "symbol: " + symbol + "\n" +
                    "open: " + open + "\n" +
                    "high: " + high + "\n" +
                    "low: " + low + "\n" +
                    "price: " + price + "\n" +
                    "volume: " + volume + "\n" +
                    "latest Trading Day: '" + latestTradingDay + '\'' + "\n" +
                    "previous close: " + previousClose + "\n" +
                    "change: " + change + "\n" +
                    "change percent: '" + changePercent + '\'';
        }
    }
