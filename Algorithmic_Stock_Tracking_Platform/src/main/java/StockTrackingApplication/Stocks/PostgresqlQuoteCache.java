package StockTrackingApplication.Stocks;

import java.sql.*;

public class PostgresqlQuoteCache {

        private static final String URL = "jdbc:postgresql://localhost:5432/algostocktrackingdb";
        private static final String USER = "testaccount";
        private static final String PASSWORD = "test123";

        private static final String SQL_INSERT_STOCK = "INSERT INTO stocks (symbol, open, high, low, price, volume, latest_trading_day, previous_close, change, change_percent) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        private static final String SQL_UPDATE_STOCK = "UPDATE stocks SET open = ?, high = ?, low = ?, price = ?, volume = ?, latest_trading_day = ?, previous_close = ?, change = ?, change_percent = ? WHERE symbol = ?";
        private static final String SQL_STOCK_EXISTS = "SELECT COUNT(*) FROM stocks WHERE symbol = ?";


        public void saveStock(Quote quote) {
            try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
                if (stockExists(connection, quote.getSymbol())) updateStock(connection, quote);
                else insertStock(connection, quote);

            } catch (SQLException e) {
                System.err.println("SQL Exception: " + e.getMessage());
            }
        }

        private boolean stockExists (Connection connection, String symbol)  throws SQLException {
            try (PreparedStatement preparedStatement = connection.prepareStatement(SQL_STOCK_EXISTS)) {
                preparedStatement.setString(1, symbol);
                ResultSet resultSet = preparedStatement.executeQuery();
                resultSet.next();
                return resultSet.getInt(1) > 0;
            }
        }
        private void insertStock (Connection connection, Quote quote) throws SQLException{
            try (PreparedStatement preparedStatement = connection.prepareStatement(SQL_INSERT_STOCK)) {
                preparedStatement.setString(1, quote.getSymbol());
                preparedStatement.setDouble(2, quote.getOpen());
                preparedStatement.setDouble(3, quote.getHigh());
                preparedStatement.setDouble(4, quote.getLow());
                preparedStatement.setDouble(5, quote.getPrice());
                preparedStatement.setInt(6, quote.getVolume());
                preparedStatement.setString(7, quote.getLatestTradingDay());
                preparedStatement.setDouble(8, quote.getPreviousClose());
                preparedStatement.setDouble(9, quote.getChange());
                preparedStatement.setString(10, quote.getChangePercent());

                int rowsAffected = preparedStatement.executeUpdate();
                preparedStatement.close();
                System.out.println("Inserted rows affected: " + rowsAffected);
            }
        }

        private void updateStock (Connection connection, Quote quote) throws SQLException {
            try (PreparedStatement preparedStatement = connection.prepareStatement(SQL_UPDATE_STOCK)) {
                preparedStatement.setDouble(1, quote.getOpen());
                preparedStatement.setDouble(2, quote.getHigh());
                preparedStatement.setDouble(3, quote.getLow());
                preparedStatement.setDouble(4, quote.getPrice());
                preparedStatement.setInt(5, quote.getVolume());
                preparedStatement.setString(6, quote.getLatestTradingDay());
                preparedStatement.setDouble(7, quote.getPreviousClose());
                preparedStatement.setDouble(8, quote.getChange());
                preparedStatement.setString(9, quote.getChangePercent());
                preparedStatement.setString(10, quote.getSymbol());


                int rowsAffected = preparedStatement.executeUpdate();
                preparedStatement.close();
                System.out.println("Updated rows affected: " + rowsAffected);
            }
        }
    }
