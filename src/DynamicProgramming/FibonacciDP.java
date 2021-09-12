package DynamicProgramming;/*
 * Created by Vaishnavi Chaurasia
 * 09-Sep-21
 * 11:52 PM
 * DataStructure-Problems
 */

import java.util.Arrays;

// Recursion + Storing somewhere = Process known as Memoization
public class FibonacciDP {

    public static int fibonacci(int n , int dp[]) {

        if (n == 0 || n == 1) {
            return n;
        }

        int ans1, ans2;

        if (dp[n - 1] == -1){
            ans1 = fibonacci(n - 1, dp);
        dp[n - 1] = ans1;
    }
       else
        ans1 = dp[n - 1];


        if (dp[n - 2] == -1){
            ans2 = fibonacci(n - 2, dp);
        dp[n - 2] = ans2;
    }
        else
            ans2 = dp[n-2] ;


       return ans1+ans2;
    }

    public static void main(String[] args) {

        int n = 10; //55
        int dp[] = new int[n+1];

        Arrays.fill(dp,-1);

        System.out.println(fibonacci(n,dp));

    }
}
