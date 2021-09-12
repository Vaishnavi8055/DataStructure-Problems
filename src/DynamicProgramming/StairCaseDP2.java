package DynamicProgramming;/*
 * Created by Vaishnavi Chaurasia
 * 11-Sep-21
 * 5:35 PM
 * DataStructure-Problems
 */

import java.util.Arrays;

// By Iterative DP
public class StairCaseDP2 {

    public static int countPossibleWays(int n , int dp[]){

       dp[0] = 1;
       dp[1] = 1;
       dp[2] = 2;

       for(int i=3 ; i<=n ; i++){
           dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
       }
        return dp[n];
    }


    public static void main(String[] args) {

        int n = 4; //7
        int dp[] = new int[n+1];

        Arrays.fill(dp,-1);

        System.out.println(countPossibleWays(n , dp));
    }
}
