import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // balance -- starting balance
        double balance;

        try {
            String question = "Enter your balance: ";
            balance = scanInput(question).nextDouble();
        } catch (Exception e) {
            System.out.println("Invalid input for balance, please provide a valid one next time when you will run this software.");
            return;
        }

        // Do you have money?
        if (! (balance > 0)) {
            // You do not have money
            System.out.println("I though you might try this, stop wasting your time.");
            return;
        }

        // You have money
        System.out.println("your balance is : " + balance + ". Have fun gambling :)");

        // stock name
        System.out.println("add a stock name");
        Scanner scannedStockName = new Scanner(System.in);

        String stockName = "";
        try {
            stockName = scannedStockName.nextLine();
        } catch (Exception e) {
            System.out.println("You've entered an invalid stock name. Try again.");
        }

        System.out.println("you've bought " + stockName + " stock. Worst decision ever.");


        // stock price
        System.out.println("how much is one share worth these days ? ");
        Scanner scannedStockPrice = new Scanner(System.in);

        double stockPrice = 0;
        try {
            stockPrice = scannedStockPrice.nextDouble();
        } catch (Exception e) {
            System.out.println("Invalid stock price, enter a valid price next time.");
            return;
        }

        if (! (stockPrice > 0)) {
            System.out.println("stock price has to be above 0. ");
            return;
        }

        // quantity (have to be double)
        System.out.println("Please enter the quantity: ");
        Scanner scannedQuantity = new Scanner(System.in);

        double quantity = 0;
        try {
            quantity = scannedStockPrice.nextDouble();
        } catch (Exception e) {
            System.out.println("Invalid quantity, enter a valid quantity next time.");
        }

        if (! (quantity > 0)) {
            System.out.println("quantity has to be above 0. ");
            return;
        }

        double totalExpense = stockPrice * quantity;

        // check if there is enough money
        if (balance < totalExpense) {
            System.out.println("insufficient balance, try something you CAN afford. ");
            return;
        }

        System.out.println("you've bought " + stockName + " for " + stockPrice + " usd?  qty: " + quantity + "... total rip off.");

        // balance left
        balance = balance - totalExpense;

        System.out.println("after this purchase, your balance is : " + balance + " usd. Please come again.");
    }

    private Scanner scanInput(String question) {
        System.out.println(question);
        return Scanner(System.in);
    }







    /* ----> the following methods will replace the actual current  way of doing things (everything in Main)
             Initially I started with these methods, but for easier approach, i've stuck with plain Main method.
             Will refactor (into classes, interfaces, methods, etc) after finishing the current approach (everything in Main).


     */

//    private void balance() {     // balance -- starting balance
//
//        System.out.println("what's your USD balance ?");
//        Scanner keyboard = new Scanner(System.in);
//        double startingBalance = keyboard.nextDouble();
//        System.out.println("your balance is : " + startingBalance + ". Have fun gambling :)");
//    }
//
//    private void addStock() {    // addStock -- add a stock
//
//        System.out.println("would you like to buy a stock ? ");
//        Scanner keyboard = new Scanner(System.in);
//        String stockName = keyboard.nextLine();
//        System.out.println("you've bought " + stockName + " stock. Enjoy seeing it go to 0.");
//    }
//
//    private void stockPrice() {    // addStock -- add a stock
//
//        System.out.println("how much is one share worth these days ? ");
//        Scanner keyboard = new Scanner(System.in);
//        double stockPrice = keyboard.nextDouble();
//        System.out.println("you've bought the stock for " + stockPrice + " usd.");
//    }
//
//    private void stockAmount() {    // addStock -- add a stock
//
//        System.out.println("how many shares did you bought ? ");
//        Scanner keyboard = new Scanner(System.in);
//        double stockAmount = keyboard.nextDouble();
//        System.out.println("you've bought " + stockAmount + " nr shares.");
//    }
//
//    private void balanceLeft() {
//        // starting balance minus each stock added.
//    }
//
//    private void stockWorth() {
//        // stockPrice * stockAmount
//    }

}
