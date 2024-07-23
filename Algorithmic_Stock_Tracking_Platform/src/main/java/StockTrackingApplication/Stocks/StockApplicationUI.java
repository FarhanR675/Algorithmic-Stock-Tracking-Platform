package StockTrackingApplication.Stocks;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class StockApplicationUI extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/StockTrackingApplication/Stocks/StockApplicationUI.fxml"));
        Parent root = loader.load();

        Scene scene = new Scene(root, 400, 200);
        scene.getStylesheets().add(getClass().getResource("/StockTrackingApplication/Stocks/application.css").toExternalForm());
        primaryStage.setTitle("Algorithmic Stock Tracker");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
