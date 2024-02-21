public class checkPalindrome {
    public static void main(String[] args) {
        String stn = "Mallam";
        System.out.println(isPalindrome(stn));
    }

    public static boolean isPalindrome(String str) {
        StringBuilder s = new StringBuilder(str);
        return s.reverse().toString().equalsIgnoreCase(str);
    }
}
