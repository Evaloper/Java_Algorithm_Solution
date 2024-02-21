package ArrayOfProducts;

import java.util.Arrays;

public class Products {
    public static void main(String[] args) {
        int [] number = {5, 1, 4, 2};
        int [] number1 = {2, 1, 2, 2};
        int[] output = doSomething(number);
        int[] output1 = doSomething(number1);
        System.out.println(Arrays.toString(output));
        System.out.println(Arrays.toString(output1));

    }

    public static int[] doSomething(int[] nums){
//        int product = 1;
//        int count = 0;
//        int[] output = new int[nums.length];
//
//        for (int i = 0; i < nums.length; i++){
//            for (int j = 0; j < nums.length; j++){
//
////                nums[i] *= nums[j];
//                product *= nums[j];
//
//            }
//            output[i] = product/nums[i];
//            product = 1;
//        }
//        return output;


        int[] result = new int[nums.length];
        int totalProduct = 1;
        for (int num : nums) {
            totalProduct *= num;
        }
        for (int i = 0; i < nums.length; i++) {
            result[i] = totalProduct / nums[i];
        }

        return result;
    }
}
