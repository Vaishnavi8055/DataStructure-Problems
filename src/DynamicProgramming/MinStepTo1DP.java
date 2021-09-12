package DynamicProgramming;/*
 * Created by Vaishnavi Chaurasia
 * 11-Sep-21
 * 10:00 PM
 * DataStructure-Problems
 */

import java.util.Arrays;

// Simple Recursion
public class MinStepTo1DP {

    public static int minStepTo1(int n){

        if(n==1)
            return 0;

        int count1 = 1+ minStepTo1(n-1);
        

        int count2 = Integer.MAX_VALUE;
        if(n%2 == 0) {
           count2 = 1+ minStepTo1(n / 2);
        }

        int count3 = Integer.MAX_VALUE;

        if(n%3 == 0) {
            count3 = 1 + minStepTo1(n / 3);
        }
        
        int min_count = (int) Math.min(Math.min(count1 , count2) , count3);

//        System.out.println(count1);
//        System.out.println(count2);
//        System.out.println(count3);
        
        return min_count;
    }

    public static void main(String[] args) {

        int n = 10; //3
//        int dp[] = new int[n+1];
//
//        Arrays.fill(dp,-1);

        System.out.println(minStepTo1(n));

    }
}
