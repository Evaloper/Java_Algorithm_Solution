package bankApp;

public class Account {

    private int accountNumber;
    private String accountName;

    private float amount;

    public Account(int accountNumber, String accountName, Float amount) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.amount = amount;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    void deposit(float amt){
        amount = amount + amt;
        System.out.println(amt + "successfully deposited. You current balance is " + amount);
    }

    void withdraw(float amt){
        if(amount < amt){
            System.out.println("Insufficient Balance");
        } else{
            amount = amount - amt;
            System.out.println("You just withdrew " + amt + ". Your current balance is " + amount);
        }
    }

    void currentBalance(){
        System.out.println("Your current balance is " + amount);
    }

    void display(){
        System.out.println(accountNumber + " " + accountName + " " + amount);
    }
}
