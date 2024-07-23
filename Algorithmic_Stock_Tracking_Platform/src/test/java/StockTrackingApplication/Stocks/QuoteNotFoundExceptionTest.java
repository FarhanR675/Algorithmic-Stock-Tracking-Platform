package StockTrackingApplication.Stocks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuoteNotFoundExceptionTest {

    @Test
    void testQuoteNotFoundException () {
        QuoteNotFoundException quoteNotFoundException = new QuoteNotFoundException("QUOTE NOT FOUND");
        Assertions.assertNotNull(quoteNotFoundException);
        //Assertions.assertEquals("QUOTE NOT FOUND", quoteNotFoundException.getMessage());
    }

}