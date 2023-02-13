package com.sparta;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    @ParameterizedTest
    @ValueSource(strings = {"mum","maoam","dad", "saippuakivikauppias", "tattarrattat"})
    @DisplayName("Given these strings should produce true")
    public void givenTheseStringTest(String strings){
        Boolean expected = true;
        Boolean result = Palindrome.checkPalindrome(strings);
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"thold ","something","bad", "somethingsnotrighthere", "many"})
    @DisplayName("Given these strings should produce false")
    public void givenTheseStringTest2(String strings){
        Boolean expected = false;
        Boolean result = Palindrome.checkPalindrome(strings);
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"Lear's in Israel.", "Sir, I demand, I am a maid named Iris."})
    @DisplayName("Given these sentences should produce true")
    public void givenThisSentenceTest(String strings){
        Boolean expected = true;
        Boolean result = SentencePalindrome.IsSentencePalindrome(strings);
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"The quick brown fox jumps over the lazy dog",  "This is Sparta!"})
    @DisplayName("Given these sentences should produce false")
    public void givenThisSentenceTest2(String strings){
        Boolean expected = false;
        Boolean result = SentencePalindrome.IsSentencePalindrome(strings);
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"saippuakivikauppias tattarrattat dad maoam"})
    @DisplayName("Given these sentences should produce false")
    public void givenASentence(String strings){
        String expected = "saippuakivikauppias";
        String result = LongestPalindrome.findLongestPalindrome(strings);
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"something fold once twice and maybe a third"})
    @DisplayName("Given these sentences should produce false")
    public void givenASentence2(String strings){
        String expected = "No Palindromes in sentence";
        String result = LongestPalindrome.findLongestPalindrome(strings);
        Assertions.assertEquals(expected, result);
    }
}