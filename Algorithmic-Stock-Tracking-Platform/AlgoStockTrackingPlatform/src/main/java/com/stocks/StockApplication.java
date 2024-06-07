package com.stocks;

import com.stockTradingMethods.trueRange.TrueRange;
import com.stockTradingMethods.vwap.VwapCalculator;

import java.util.Scanner;

public class StockApplication {

    public static void main(String[] args) {
        QuoteCache quoteCache = new MapQuoteCache();
        AlphaVantageApi alphaVantageApi = new AlphaVantageApi();
        PostgresqlQuoteCache postgresqlQuoteCache = new PostgresqlQuoteCache();
        VwapCalculator vwapCalculator = new VwapCalculator();
        TrueRange trueRange = new TrueRange();
        Scanner scanner = new Scanner(System.in);

        String quitPrompt = "q";
        boolean running = true;


        System.out.print("Enter Stock Symbol: ");
        String stockSymbol = scanner.next();
        try {
            Quote quote = alphaVantageApi.getQuote(stockSymbol.toUpperCase());
            quoteCache.addQuote(quote);
        } catch (QuoteNotFoundException e) {
            e.printStackTrace();
        }
        Quote stockQuote = quoteCache.getQuote(stockSymbol.toUpperCase());

        while (running == true) {
            if (stockQuote != null) {
                postgresqlQuoteCache.saveStock(stockQuote);
                    System.out.println("Quote found for: " + stockSymbol.toUpperCase() +
                            ", Please enter a number from one of the following options: " + "\n 1. Global Quote\n 2. Calculate VWAP\n 3. Calculate True Range \n 4. Exit");
                    System.out.print("SELECTED OPTION: ");
            } else throw new RuntimeException("Failed to find quote for " + stockSymbol + ". Please check if the stock symbol is correct.");

        String userOption = scanner.next();
            switch (userOption) {
                    case "1":
                        System.out.println("Global Quote: " + stockQuote);
                        System.out.print("Enter any key to continue or 'q' to quit: ");
                        String userInput = scanner.next();
                        if (userInput.equals(quitPrompt)) {
                            break;
                        } else {
                            continue;
                        }
                    case "2":
                        System.out.println("The \"VWAP\" for " + stockSymbol.toUpperCase() + ": " + vwapCalculator.getVwap(stockQuote));
                        System.out.println("Enter any key to continue or 'q' to quit");
                        String userInput2 = scanner.next();
                        if (userInput2.equals(quitPrompt)) {
                            break;
                        } else {
                            continue;
                        }
                    case "3":
                        System.out.println("The \"True Range\" for " + stockSymbol.toUpperCase() + ": " + trueRange.getTrueRange(stockQuote));
                        System.out.println("Enter any key to continue or 'q' to quit");
                        String userInput3 = scanner.next();
                        if (userInput3.equals(quitPrompt)) {
                            break;
                        } else {
                            continue;
                        }
                case "4":
                    break;
                    default:
                        System.out.println("ERROR: Invalid option, please try again.");
                        continue;
                }
                running = false;
            }
        }
    }

