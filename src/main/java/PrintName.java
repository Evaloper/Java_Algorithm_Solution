import java.util.Scanner;

public class PrintName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter First name: ");
        String firstName = reader.nextLine();

        System.out.println("Enter Last name: ");
        String lastName = reader.nextLine();

        System.out.println("My full name is: " + firstName + " " + lastName);



    }
}
