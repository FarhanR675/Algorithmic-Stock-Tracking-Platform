package StockTrackingApplication.Stocks;

public class QuoteNotFoundException extends Exception {
    public QuoteNotFoundException (String message) {
        super (message);
    }
}
