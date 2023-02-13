package com.sparta;

public class SentencePalindrome {
    public static boolean IsSentencePalindrome(String sentence){

        sentence = sentence.replaceAll("[^A-Za-z]+", "").toLowerCase();

        return Palindrome.checkPalindrome(sentence);

    }
}
