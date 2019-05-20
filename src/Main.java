import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        System.out.println("what's your USD balance ?");                            // balance -- starting balance
        Scanner usdbalance = new Scanner(System.in);
        double startingBalance = usdbalance.nextDouble();

        if (startingBalance < 0) {
            System.out.println("I though you might try this, stop wasting your time.");
        } else {
            System.out.println("your balance is : " + startingBalance + ". Have fun gambling :)");
        }


        System.out.println("add a stock name");                                     // stock name
        Scanner stockname = new Scanner(System.in);
        String stockName = stockname.nextLine();
        System.out.println("you've bought " + stockName + " stock. Worst decision ever.");
        // needs method: if name already exists, try again
        // catch everything else other than String and try again


        System.out.println("how much is one share worth these days ? ");            // stock price
        Scanner stockprice = new Scanner(System.in);
        double stockPrice = stockprice.nextDouble();

        if (stockPrice > startingBalance) {
            System.out.println("insufficient balance, try something you CAN afford. ");
        } else {
            System.out.println("you've bought " + stockName + " for " + stockPrice + " usd? wow... total rip off.");
        }
        //


        System.out.println("how many shares did you bought ? ");                     // stock amount
        Scanner stockamount = new Scanner(System.in);
        double stockAmount = stockamount.nextDouble();

        if ((stockAmount * stockPrice) > startingBalance) {
            System.out.println("insufficient balance, buy less shares. ");
        } else {
            System.out.println("you've bought " + stockAmount + " " + stockName + " shares. You must hate money...");
        }


        double stockWorth = stockPrice * stockAmount;                                // calculate the purchased stock (amount and price)
        double balanceLeft = startingBalance - stockWorth;                           // balance left

        if (stockWorth > startingBalance) {
            System.out.println("error, stockWorth is bigger than startingBalance"); // future catch
        }

        if ( balanceLeft < 0) {
            System.out.println("your balance is below 0, you're such a lousy gambler.");
        } else {
            System.out.println("after this purchase, your balance is : " + balanceLeft + " usd. Please come again.");
        }


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
