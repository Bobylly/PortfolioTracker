package Model;

public class User {

    private int id;
    private String firstName;
    private String lastName;
    private int balance;
    private String stocks;


    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getBalance() {
        return balance;
    }

    public String getStocks() {
        return stocks;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setStocks(String stocks) {
        this.stocks = stocks;
    }

    public User(int id, String firstName, String lastName, int balance, String stocks) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
        this.stocks = stocks;
    }
}
