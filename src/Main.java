import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) {

        // SQL connection
        SQLConnection connection = new SQLConnection();
        connection.startConnection();


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
        // todo: need to catch Integers, since stockName has to be String only; look into regex


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
        // end - stock price


        // begin - stock amount (quantity)
        double quantity = 0;
        System.out.println("how many shares did you bought ? (quantity) ");

        while (true) { // merge orice atat timp cat am o bucla infinita, spre ex for(;;)
            Scanner scannedQuantity = new Scanner(System.in);
            try {
                quantity = scannedQuantity.nextDouble();
            } catch (Exception e) {
                System.out.println("invalid input. add a valid input (try some numbers).");
                continue;
            }

            if (quantity <= 0) {
                System.out.println("invalid input. add a positive quantity. try again.");
                continue;
            }

            double totalExpenses = stockPrice * quantity;
            if (totalExpenses > balance) {
                System.out.println("quantity can't exceed balance");
                continue;
            }
            balance-=totalExpenses;
            System.out.println("congratulations. you bough " + quantity + " " + stockName + " shares " + " and" +
                    " it cost you " + totalExpenses + " usd. " + "your balance left is " + balance + " usd. the end.");
            break;
        } // end stock amount (quantity)

    } // end main
}
