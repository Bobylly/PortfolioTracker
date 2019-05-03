import stock_btc_price.EntryPrice;

import java.util.Scanner;

public class Portfolio implements UserKeyboard_Input {
    // add DB id

    /* add user keyboard input for each variable
    one idea is to create an interface that has all these methods (inputs user keyboard values)
    * */
    String stock_name ;
    int stock_ammount ;
    int stock_btc_total_ammount_entry_price;
    int stock_btc_total_sell_price;

    int stock_usd_entry_price;
    int stock_usd_total_ammount_entry_price;
    int stock_usd_sell_price;
    int stock_usd_total_sell_price;

    int current_btc_price;
    int starting_portfolio_ammount;
    int current_portfolio_ammount;

    public void total_ammount_btc_price() {

    }

    @Override
    public void get_userInput() {
        System.out.println("add a stock name");
        Scanner keyboard = new Scanner(System.in);
        String stock_name = keyboard.nextLine();
        System.out.println(stock_name);
    }
}
