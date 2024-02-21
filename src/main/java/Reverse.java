import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int[] number = {5,2,3,7,1,6};
        reverseArray(number);

        System.out.println(Arrays.toString(number));


    }

    public static int reverseArray(int[] nums){
        int start = 0;
        int end = nums.length - 1;

        while (start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
        return 1;
    }
}
