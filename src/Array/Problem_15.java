package Array;/*
 * Created by Vaishnavi Chaurasia
 * 09-Aug-21
 * 2:03 AM
 * DataStructure-Problems
 */

// Find maximum subarray sum by Kadane's Algorithm
public class Problem_15 {

    public static void main(String[] args) {

        int arr[] = {-2,-3,4,5,-1,-1,4};

        int sum = 0;
        int maxSum = arr[0];
        int n = arr.length;

        for(int i=0 ; i<n ; i++){
            sum += arr[i];

            if(sum > maxSum)
                maxSum = sum;

            // As we only want sum to be positive
            if(sum < 0)
                sum = 0;
        }
    }
}
