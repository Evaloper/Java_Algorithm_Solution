import java.util.Arrays;

public class DispenseCash {
    public static void main(String[] args) {
        int[] withdraw1 = withdraw(360);
        int[] withdraw2 = withdraw(280);

        System.out.println(Arrays.toString(withdraw1));
        System.out.println(Arrays.toString(withdraw2));

    }

    public static int[] withdraw(int amount){

        if(amount >= 40 && amount <= 1000){
            int hundred = amount / 100;
            amount = amount % 100;

            int fifty = (amount % 100 == 50) ? 1 : 0;
            amount = amount- fifty * 50;

            int twenty = (amount / 20 == 0) ? 0 : 1;

            return new int[] {hundred, fifty, twenty};
        }

        return null;
    }
}
