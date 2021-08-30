package Recursion;/*
 * Created by Vaishnavi Chaurasia
 * 31-Aug-21
 * 7:11 AM
 * DataStructure-Problems
 */

// WAP to print numbers from 1 to n in increasing order recursively.
public class Problem_2 {

    public static void printNumber(int n){

        if(n == 0)
          return;

        printNumber(n-1);
        System.out.print(n +" ");

        return;
    }

    public static void main(String[] args) {
        printNumber(5);
    }
}
