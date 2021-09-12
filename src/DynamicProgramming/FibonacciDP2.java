package DynamicProgramming;/*
 * Created by Vaishnavi Chaurasia
 * 11-Sep-21
 * 4:46 PM
 * DataStructure-Problems
 */

import java.util.Arrays;

// By Iterative DP
public class FibonacciDP2 {

    private static int fibonacci(int n, int[] dp) {

        // base cases
        dp[0] = 0;
        dp[1] = 1;

        for(int i=2 ; i<=n ; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }

        return dp[n];
    }


    public static void main(String[] args) {

        int n = 6; //55
        int dp[] = new int[n+1];

        Arrays.fill(dp,-1);

        System.out.println(fibonacci(n,dp));

    }

}
