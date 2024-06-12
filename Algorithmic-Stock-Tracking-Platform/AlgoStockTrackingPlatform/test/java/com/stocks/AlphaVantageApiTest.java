package com.stocks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class AlphaVantageApiTest {

    @Test
    void testAlphaVantageApi () throws QuoteNotFoundException {
        AlphaVantageApi alphaVantageApi = new AlphaVantageApi();
        Quote quote = alphaVantageApi.getQuote("MSFT");
        Assertions.assertNotNull(quote);
        System.out.println(quote);
    }

}