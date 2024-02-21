import java.util.Arrays;

public class DispenseCash2 {
    public static void main(String[] args) {
        int[] withdraw1 = withdraw(360);
        int[] withdraw2 = withdraw(280);

        System.out.println(Arrays.toString(withdraw1));
        System.out.println(Arrays.toString(withdraw2));

        // Additional test cases
        int[] withdraw3 = withdraw(980);
        int[] withdraw4 = withdraw(550);
        System.out.println(Arrays.toString(withdraw3));
        System.out.println(Arrays.toString(withdraw4));
    }

    public static int[] withdraw(int amount){
        if(amount < 40 || amount > 1000)
            return null;

        int hundred = amount / 100;
        amount %= 100;

        int fifty = amount / 50;
        amount %= 50;

        int twenty = amount / 20;
        amount %= 20;

        // If there's a remainder, adjust the dispense
        if (amount != 0) {
            if (fifty > 0) {
                fifty--;
                twenty += 3;
            } else if (hundred > 0) {
                hundred--;
                fifty += 1;
                twenty += 4;
            }
        }

        return new int[] {hundred, fifty, twenty};
    }
}
