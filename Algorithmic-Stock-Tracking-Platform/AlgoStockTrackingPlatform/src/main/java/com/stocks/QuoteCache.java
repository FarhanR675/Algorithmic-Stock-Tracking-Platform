package com.stocks;

public interface QuoteCache {

    Quote getQuote(String symbol);

    void addQuote(Quote quote);
}
