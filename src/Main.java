import java.util.Scanner;

public class Main {
    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {


        // begin - balance
        double balance;
        System.out.println("enter your balance: ");
        Scanner scannedBalance = new Scanner(System.in);

        try {
            balance = scannedBalance.nextDouble();
        } catch (Exception e){
            System.out.println("invalid input. please provide a valid input to continue.");
            return;
        } // end - balance


        // begin - verify user has balance.
        if ( !(balance > 0)) {
            System.out.println("it seems you don't have enough funds. top up your balance to continue.");
            return; // todo: add a loop, asking for funds
        }


        // begin - stock name
        String stockName;
        System.out.println("add a stock name: ");
        Scanner scannedStockName = new Scanner(System.in);

        try {
            stockName = scannedStockName.nextLine();
            System.out.println("you've bought " + stockName + " stock. ");

        } catch (Exception e) {
            System.out.println("invalid stock name, please enter a valid stock name.");
            return;
        } // end - stock name todo: doesn't catch anything ... needs a revisit.



        // begin - stock price
        double stockPrice;
        System.out.println("how much does one " + stockName + " stock cost ? ");

        try {
            Scanner scannedStockPrice = new Scanner(System.in);
            stockPrice = scannedStockPrice.nextDouble();
        } catch (Exception e) {
            System.out.println("invalid input. add a real price (try some numbers).");
            return;
        }


        if (stockPrice == 0) {
            System.out.println(stockName + " can't be 0. add a valid price.");
            return;
        }

        if (!(stockPrice > 0.00000001)) {
            System.out.println("invalid input. add a valid price for " + stockName + ".");
            return;
        }

        if (stockPrice > balance) {
            System.out.println(stockName + "'s price exceeds your balance. add more funds to buy it.");
            return;
        } // todo: add a loop, asking to try again (try again or cancel).
        // end - stock price



        // begin - stock amount
        double quantity;
        System.out.println("how many shares did you bought ? ");
        Scanner scannedQuantity = new Scanner(System.in);

        try {
            quantity = scannedQuantity.nextDouble();
        } catch (Exception e) {
            System.out.println("invalid input. add a valid input (try some numbers).");
            return;
        }

        if (quantity == 0) {
            System.out.println("invalid input. 0 shares can't be considered.");
            return;
        }

        if (!(quantity > 0)) {
            System.out.println("invalid input. add a positive value.");
            return;
        }

        if ((quantity * stockPrice) > balance) {
            System.out.println("insufficient balance, buy less shares. ");
            return;
        }

        // calculate the purchased stock (amount and price)
        double totalExpenses = stockPrice * quantity;

        if (totalExpenses > balance) {
            System.out.println("error, stockWorth is bigger than startingBalance");
        }

        balance-=totalExpenses;
            System.out.println("congratulations. you bough " + quantity + " " + stockName + "shares " + " and" +
                    " it cost you " + totalExpenses + " usd. " + "your balance left is " + balance + " usd. the end.");

    }







    /* ----> the following methods will replace the actual current  way of doing things (everything in Main)
             Initially I started with these methods, but for easier approach, i've stuck with plain Main method.
             Will refactor (into classes, interfaces, methods, etc) after finishing the current approach (everything in Main).


     */

    private void balance() {     // balance -- starting balance

        System.out.println("what's your USD balance ?");
        Scanner keyboard = new Scanner(System.in);
        double startingBalance = keyboard.nextDouble();
        System.out.println("your balance is : " + startingBalance + ". Have fun gambling :)");
    }

    private void addStock() {    // addStock -- add a stock

        System.out.println("would you like to buy a stock ? ");
        Scanner keyboard = new Scanner(System.in);
        String stockName = keyboard.nextLine();
        System.out.println("you've bought " + stockName + " stock. Enjoy seeing it go to 0.");
    }

    private void stockPrice() {    // addStock -- add a stock

        System.out.println("how much is one share worth these days ? ");
        Scanner keyboard = new Scanner(System.in);
        double stockPrice = keyboard.nextDouble();
        System.out.println("you've bought the stock for " + stockPrice + " usd.");
    }

    private void stockAmount() {    // addStock -- add a stock

        System.out.println("how many shares did you bought ? ");
        Scanner keyboard = new Scanner(System.in);
        double stockAmount = keyboard.nextDouble();
        System.out.println("you've bought " + stockAmount + " nr shares.");
    }

    private void balanceLeft() {
        // starting balance minus each stock added.
    }

    private void stockWorth() {
        // stockPrice * stockAmount
    }

}
