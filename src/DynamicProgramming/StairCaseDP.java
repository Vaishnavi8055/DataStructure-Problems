package DynamicProgramming;/*
 * Created by Vaishnavi Chaurasia
 * 11-Sep-21
 * 5:23 PM
 * DataStructure-Problems
 */

import java.util.Arrays;

// By Simple Recursion
public class StairCaseDP {

    public static int countPossibleWays(int n){

        // -ve Base Case
        if(n<0){
            return 0;
        }
        //+ve Base Case
        if(n == 0){
            return 1;
        }

      int step_1 =  countPossibleWays(n-1);
      int step_2 =  countPossibleWays(n-2);
      int step_3 =  countPossibleWays(n-3);

      int ways = step_1+step_2+step_3;

      return ways;
    }


    public static void main(String[] args) {

        int n = 4;
//        int dp[] = new int[n+1];
//
//        Arrays.fill(dp,-1);

        System.out.println(countPossibleWays(n));
    }
}
