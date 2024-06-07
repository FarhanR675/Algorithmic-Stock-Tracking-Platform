package com.stocks;

public class QuoteNotFoundException extends Exception {
    public QuoteNotFoundException (String message) {
        super (message);
    }
}
