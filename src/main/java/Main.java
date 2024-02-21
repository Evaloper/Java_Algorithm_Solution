import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] number = withdraw(360);
        int[] number1 = withdraw(480);
        int[] number2 = withdraw(250);
        System.out.println(Arrays.toString(number));
        System.out.println(Arrays.toString(number1));
        System.out.println(Arrays.toString(number2));
    }

    public static int[] withdraw(int amount){


        if (amount >= 40 && amount <= 1000){
            int hundred = amount/100;
            amount = amount % 100;

            int fifty = (amount % 100 == 50) ? 1 : 0;
            amount  -= fifty * 50;

            int twenty = amount / 20 + (amount % 20 == 0 ? 0 : 1);



            return new int [] {hundred, fifty, twenty};
        }

        return null;
    }
}
