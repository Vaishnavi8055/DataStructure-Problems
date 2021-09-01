package Recursion;/*
 * Created by Vaishnavi Chaurasia
 * 31-Aug-21
 * 11:35 PM
 * DataStructure-Problems
 */

// Find the Nth Fibonacci Number
public class Problem_4 {

    public static int N_Fibo_Number(int n){

        if(n == 0)
            return 0;

        if(n==1)
            return 1;

        return N_Fibo_Number(n-1) +  N_Fibo_Number(n-2);

    }

    public static void main(String[] args) {

        System.out.println(N_Fibo_Number(6));
    }

}
