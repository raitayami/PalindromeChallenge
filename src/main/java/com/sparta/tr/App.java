package com.sparta.tr;

/**
 * Hello world!
 *
 */
public class App {

    public static void main( String[] args ) {

        System.out.println((isPalindrome("affa")));

    }

    //Task 1
    public static Boolean isPalindrome(String word){

        char[] arr = word.toCharArray();
        char[] arr2 = new char[word.length()];

        for(int i = word.length()-1; i >= 0; i--){
            arr2[i] = arr[word.length()-i-1];
        }

        String reverseString = new String(arr2);

        if(word.equals(reverseString)){
            return true;
        } else {
            return false;
        }
    }

    //Task 2 - longest palindrome in an array

//    public static String findLongestPalindrome(String[] palindromeArray){
//
//        String finalAnswer;
//
//        for(int i = 0; )
//
//
//    }

}
