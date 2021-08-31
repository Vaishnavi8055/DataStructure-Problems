package Recursion;/*
 * Created by Vaishnavi Chaurasia
 * 31-Aug-21
 * 8:09 AM
 * DataStructure-Problems
 */

public class Problem_3 {

    public static int numberOfDigits(int n , int count){

        if(n == 0)
            return count;

       return numberOfDigits(n/10 , count+1);
    }

    public static void main(String[] args) {
        System.out.println(numberOfDigits(156888 , 0));
    }
}
