package Array;/*
 * Created by Vaishnavi Chaurasia
 * 08-Aug-21
 * 6:27 AM
 * DataStructure-Problems
 */

// Find Maximum Contiguous Subarray Sum
public class Problem_14 {

    public static void main(String[] args) {

        // O/P -> 6 + -2 + -3 + 1 + 5 = 7
        int arr[] = {6 ,-2 , -3 , 1 , 5};
        int n = arr.length;
        int sum =0 , maxSum = arr[0];

        for(int i=0 ; i<n ; i++){
            // j variable tracks i as it maintains a subarray between i & j
            for(int j=i ; j<n ; j++) {
                sum = 0;
                // k variable tracks the sum of elements between index i to j
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }
                maxSum = Math.max(maxSum, sum);
            }

        }
        System.out.println(maxSum);
    }
}
