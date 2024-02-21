package org.example;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println(isPrime(11));
        System.out.println(isPrime(9));
        System.out.println(isPrime(21));
    }
    public static boolean isPrime(int n){
        if(n <= 1){
            return false;
        }

        if (n <= 3){
            return true;
        }

        for(int i = 2; i <= n/2; i++){
            if(n % i == 0){
                return false;
            }
        }

        return true;
    }
}
