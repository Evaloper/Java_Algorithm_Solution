package org.example;

public class uniqueCharacters {
    public static void main(String[] args) {
        String str = "abcduy";
        System.out.println(uniqueStr(str));
    }

    public static boolean uniqueStr(String str){

        for(int i = 0; i < str.length(); i++){
            for( int j = i + 1; j < str.length(); j++){
                if(str.charAt(i) == str.charAt(j)){
                    return false;
                }
            }
        }

        return true;
    }
}
