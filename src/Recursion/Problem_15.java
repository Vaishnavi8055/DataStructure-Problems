package Recursion;/*
 * Created by Vaishnavi Chaurasia
 * 02-Sep-21
 * 8:18 PM
 * DataStructure-Problems
 */

public class Problem_15 {

    public static void main(String[] args) {

        System.out.println(sumOfDigits(123));
    }

    public static int sumOfDigits(int N){

        if(N == 0)
            return 0;

       int sum =  N%10 + sumOfDigits(N/10);
        return sum;
    }
}
