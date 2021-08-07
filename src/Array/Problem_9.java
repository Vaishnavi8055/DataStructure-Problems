package Array;/*
 * Created by Vaishnavi Chaurasia
 * 07-Aug-21
 * 11:17 PM
 * DataStructure-Problems
 */

import java.util.Arrays;

// Find a missing and repeating (twice) number between 1 to n (inclusive)
public class Problem_9 {

    public static void main(String[] args) {

        // Missing = 4 , Repeating = 6
        int arr[] = {1,3,5,5,2,6};

        int missing = 0, repeating = 0 , count = 0;

        Arrays.sort(arr);  // -> O(nlogn)

        System.out.println(Arrays.toString(arr));
        for(int i=0 ; i<arr.length-1 ; i++){ // -> O(n)
            if(arr[i] != i+1){
                missing = arr[i];
            }
            // repeating element is within the array size
            if(arr[i] == i+1 && arr[i+1] == i+1){
                repeating = arr[i];
            }
            else if(i == arr.length-1){
                repeating = arr[arr.length-1];
            }
        }

        System.out.println(repeating + "," + missing);
    }
}
