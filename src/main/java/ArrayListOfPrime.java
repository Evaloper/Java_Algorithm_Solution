import java.util.ArrayList;
import java.util.List;

public class ArrayListOfPrime {
    public static void main(String[] args) {
        int nums = 50;
        List<Integer> primeNums = prime(nums);
        System.out.println(primeNums.size());

    }
    public static List<Integer> prime(int n){
        List<Integer> primes = new ArrayList<>();

        for (int num = 2; num <= n; num++) {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                primes.add(num);
        }
        }
        return primes;
    }
}
