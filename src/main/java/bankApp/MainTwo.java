package bankApp;

public class MainTwo {
    public static void main(String[] args) {
        Account eva = new Account(306307400, "Eva Gbaje", 6000000F);

        eva.currentBalance();
        eva.withdraw(3500000);
        eva.deposit(10000);

    }
}
