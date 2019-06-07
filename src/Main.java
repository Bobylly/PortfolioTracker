import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        // begin - balance
        double balance = 0;

        while (balance <= 0) {

            System.out.println("enter your balance: (balance) ");
            Scanner scannedBalance = new Scanner(System.in);

            try {
                balance = scannedBalance.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("invalid balance, add an positive value; ");
                continue;
            }
            // trigger diff message for negative balance
            if (balance < 0) {
                System.out.println("negative balance. try again. ");
            }
        }
                System.out.println("your balance is: " + balance);




        // begin - stock name
        String stockName;
        System.out.println("add a stock name: (stockName) ");
        Scanner scannedStockName = new Scanner(System.in);

        try {
            stockName = scannedStockName.nextLine();
            System.out.println("you've bought " + stockName + " stock. ");

        } catch (InputMismatchException e) {
            System.out.println("invalid stock name, please enter a valid stock name.");
            return;
        } // end - stock name todo: doesn't catch anything ... needs a revisit.
        // todo: need to catch Integers, since stockName has to be String only


        // begin - stock price
        double stockPrice = 0;
        System.out.println("how much does one " + stockName + " stock cost ?  (stockPrice) ");

        while (stockPrice <= 0) {
            Scanner scannedStockPrice = new Scanner(System.in);
            try {
                stockPrice = scannedStockPrice.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("invalid input. add a real price (try integers).");
                continue;
            }
            if (!(stockPrice > 0)) {
                System.out.println("invalid input. stock price has to be a positive number. try again.");
            }

        }

//        if (!(stockPrice > 0.00000001)) {
//            System.out.println("blbl invalid input. add a valid price for " + stockName + ".");
//            return;
//        }
         // todo: add a loop, asking to try again (try again or cancel).
        // end - stock price




        // begin - stock amount (quantity)
        double quantity = 0;
        System.out.println("how many shares did you bought ? (quantity) ");

        while (quantity <= 0) {
            Scanner scannedQuantity = new Scanner(System.in);
            try {
                quantity = scannedQuantity.nextDouble();
            } catch (Exception e) {
                System.out.println("invalid input. add a valid input (try some numbers).");
                continue;
            }

            if (quantity <= 0) {
                System.out.println("invalid input. add a positive quantity. try again.");
            }

            if (!(quantity > balance)) {
                System.out.println("quantity is not bigger than balance");
            } continue;
//            double totalExpenses = stockPrice * quantity;
//            if (totalExpenses > balance) {
//                System.out.println("quantity can't exceed balance");
//            }
//            balance-=totalExpenses;
//            System.out.println("congratulations. you bough " + quantity + " " + stockName + "shares " + " and" +
//                    " it cost you " + totalExpenses + " usd. " + "your balance left is " + balance + " usd. the end.");

        }

        //todo: totalExpenses can't exceed balance.



//            while (totalExpenses > balance) {
//
//                try {
//                    quantity = scannedQuantity.nextDouble();
//                    System.out.println("in try, before catch");
//
//
//                } catch (Exception e){
//                    System.out.println("in catch");
//                    System.out.println("insufficient balance, buy less shares. ");
//                } continue;
//
//            }




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

}

/*



 */