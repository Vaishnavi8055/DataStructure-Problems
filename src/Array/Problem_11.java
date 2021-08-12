package Array;/*
 * Created by Vaishnavi Chaurasia
 * 08-Aug-21
 * 10:11 PM
 * DataStructure-Problems
 */

// Find a missing and repeating (twice) number between 1 to n (inclusive)
public class Problem_11 {

    public static void main(String[] args) {

        // Missing = 4 , Repeating = 5
        int arr[] = {1, 3, 5, 5, 2, 6};
        int n = arr.length;

        // Sum of all numbers from 1 to n - n(n+1) / 2
        // Sum of all squares of numbers from 1 to n - n(n+1)(2n+1) / 6

        int sum_1toN = n*(n+1)/2;
        int sum_sq1toN = n*(n+1)*(2*n+1)/6;
        int sum_array = 0;

        for(int i=0 ; i<n ; i++)                                // YEH KRNA HAI ...................
            sum_array += arr[i];

        int s1 = sum_1toN - sum_array; // -1
        int s2 = sum_sq1toN - sum_array; // -5

        int missing = 0;
        int repeating = 0;

        int m = missing - repeating;



       // System.out.println(missing);

    }
}
