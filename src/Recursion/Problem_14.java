package Recursion;/*
 * Created by Vaishnavi Chaurasia
 * 02-Sep-21
 * 7:40 PM
 * DataStructure-Problems
 */

public class Problem_14 {

    public static void main(String[] args) {

        System.out.println(isPalindrome("racecar" , 0 , 6));
    }

    public static boolean isPalindrome(String s , int start , int end){

        if(start >= end)
            return true;

        if(s.charAt(start) == s.charAt(end)){
           return isPalindrome(s ,  start+1 , end-1);
        }
        else
            return false;
    }
}
