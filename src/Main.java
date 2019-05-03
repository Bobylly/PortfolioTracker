import stock_btc_price.EntryPrice;

public class Main {

    public static void main(String[] args) {

        Portfolio portfolio = new Portfolio();

        portfolio.get_userInput();

        EntryPrice entryprice_1 = new EntryPrice();

        entryprice_1.getPrice();

    }
}
