package com.sparta;
public class Palindrome {

    public static boolean checkPalindrome(String word)
    {
        if (word.length()>=3){
            return isPalindrome(word);
        }

        return false;
    }
    private static boolean isPalindrome(String word)
    {
        int length = word.length();

        if(length <= 2){
            if(length == 1){return true;}
            if(word.charAt(0) == word.charAt(1)){return true;}
            return false;
        }

        char fWord = word.charAt(0);
        char lWord = word.charAt(length - 1);

        if (fWord == lWord) {
            String sWord = word.substring(1, length - 1);
            return isPalindrome(sWord);
        }

        return false;
    }

}
