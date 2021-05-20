package Array;/*
 * Created by Vaishnavi Chaurasia
 * 21-May-21
 * 6:26 AM
 * Interview Problems
 */

import java.util.Arrays;

// Find Kth smallest and largest value in an array from unsorted array
// T(n) - O(nlogn)
public class Problem_6 {

    public static void k_min_max(int arr[], int k){

        Arrays.sort(arr);

        System.out.println("Kth :- max = "+ arr[k-1] + " & min = "+arr[arr.length-k]);
    }

    public static void main(String[] args) {
        int arr[] = {3,4,6,8,15,20};
        int k=2;
        k_min_max(arr,k);
    }
}
