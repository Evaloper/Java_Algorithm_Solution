package inheritance;

public class Main {
    public static void main(String[] args) {
        Programmer eva = new Programmer(350000, 200000);

        System.out.println("Programmer salary is " + eva.getSalary());
        System.out.println("Programmer bonus is " + eva.getBonus());
    }
}
