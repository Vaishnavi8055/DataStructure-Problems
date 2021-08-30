package Recursion;/*
 * Created by Vaishnavi Chaurasia
 * 31-Aug-21
 * 5:22 AM
 * DataStructure-Problems
 */

// Write a program to find x to the power n (i.e. x^n). Take x and n from the user. You need to return the answer
// Do this recursively.
public class Problem_1 {


    public static int Power(int x , int n){

        if(x == 0 && n==0){
            return 1;
        }
        if(x == 0)
            return 0;

        if (n == 0){
            return 1;
        }

        int smallAns = Power(x , n-1) * x;

        return smallAns;
    }


    public static void main(String[] args) {
        int x = 0;
        int n = 3;

        System.out.println(Power(x,n));
    }
}

