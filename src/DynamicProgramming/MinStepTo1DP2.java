package DynamicProgramming;/*
 * Created by Vaishnavi Chaurasia
 * 12-Sep-21
 * 12:52 AM
 * DataStructure-Problems
 */

import java.util.Arrays;

// By memoization
public class MinStepTo1DP2 {


    public static int minStepTo1(int n , int dp[]) {

        if (n == 1)
            return 0;

        int count1;

        if(dp[n-1] == -1) {
            count1 = 1 + minStepTo1(n - 1, dp);
            dp[n-1] = count1;
        }
        else {
            count1 = dp[n-1];
        }


        int count2 = Integer.MAX_VALUE;

        if (n % 2 == 0) {
            if (dp[n / 2] == -1) {
                count2 = 1 + minStepTo1(n / 2, dp);
                dp[n / 2] = count2;
            } else {
                count2 = dp[n / 2];
            }
        }

        int count3 = Integer.MAX_VALUE;

        if (n % 3 == 0) {
            if (dp[n / 3] == -1) {
                count3 = 1 + minStepTo1(n / 3, dp);
                dp[n / 3] = count3;
            } else {
                count3 = dp[n / 3];
            }
        }

        int min_count = (int) Math.min(Math.min(count1, count2), count3);

//        System.out.println(count1);
//        System.out.println(count2);
//        System.out.println(count3);

        return min_count;
    }

    public static void main(String[] args) {

        int n = 10; //3
        int dp[] = new int[n+1];

        Arrays.fill(dp,-1);

        System.out.println(minStepTo1(n , dp));

    }
}
