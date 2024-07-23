package StockTrackingApplication.Stocks;

public interface QuoteCache {

    Quote getQuote(String symbol);

    void addQuote(Quote quote);
}
