package StockTrackingApplication.Stocks;

import javafx.fxml.FXML;
import javafx.scene.control.Label;


public class StocksApplicationUIController {

    @FXML
    private javafx.scene.control.TextField stockSymbolField;

    @FXML
    private Label resultLabel;

    public void handleGetQuote() {
        String stockSymbol = stockSymbolField.getText().toUpperCase();
        try {
            AlphaVantageApi alphaVantageApi = new AlphaVantageApi();
            Quote quote = alphaVantageApi.getQuote(stockSymbol);
            resultLabel.setText(quote.toString());
        } catch (QuoteNotFoundException exception) {
            resultLabel.setText("Quote not found for symbol: " + stockSymbol);
        }
    }
}
