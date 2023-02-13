package com.sparta;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class LongestPalindrome {

    public static String findLongestPalindrome(String sentence){
        ArrayList<String> palindromeArray = new ArrayList<>();
        String[] wordsArray = sentence.split(" ");

        for(String word: wordsArray){
            if(Palindrome.checkPalindrome(word)){
                palindromeArray.add(word);
            }
        }
        if(palindromeArray.isEmpty()){return "No Palindromes in sentence";}
        return Collections.max(palindromeArray, Comparator.comparing(String::length));
    }
}
