import java.util.Arrays;

public class DispenseMain {
    public static void main(String[] args) {
        int[] withdraw1 = withdraw(360);
        int[] withdraw2 = withdraw(280);
        int[] withdraw3 = withdraw(980);
        int[] withdraw4 = withdraw(150);

        System.out.println(Arrays.toString(withdraw1));
        System.out.println(Arrays.toString(withdraw2));
        System.out.println(Arrays.toString(withdraw3));
        System.out.println(Arrays.toString(withdraw4));

    }

    public static int[] withdraw(int amount) {
        if (amount < 40 || amount > 1000) {
            return null;
        }

        int hundred = 0;
        int fifty = 0;
        int twenty = 0;

        while (amount > 20){
            if(amount % 100 == 0){
                amount -= 100;
                hundred++;
            } else if (amount % 50 == 0){
                amount -= 50;
                fifty++;
            } else {
                amount -= 20;
                twenty++;
            }
        }
        return new int[]{hundred,twenty,twenty};
    }
}


