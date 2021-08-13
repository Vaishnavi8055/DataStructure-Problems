package Array;/*
 * Created by Vaishnavi Chaurasia
 * 14-Aug-21
 * 6:17 AM
 * DataStructure-Problems
 */

import java.util.Arrays;

// Next Permutation
public class Problem_20 {

    public static void main(String[] args) {

        int arr[] = {1,3,5,4,2};
        int breakdownIndex1 = 0;
        int index2 = 0;

        // Find Breakdown Index
        for(int i=arr.length-1 ; i>=0 ; i--){
            if(arr[i] >= arr[i-1]){
                breakdownIndex1 = i-1;
                break;
            }
        }

        // Find Next greater element of element at breakdown Index
        int j=arr.length-1;
        while (j>breakdownIndex1){
            if(arr[breakdownIndex1] < arr[j]){
                index2 = j;
                break;
            }
            j--;
        }

        //swap next greater element and breakdown index element
        int temp = arr[index2];
        arr[index2] = arr[breakdownIndex1];
        arr[breakdownIndex1] = temp;

        // reverse right side of the array after breakdown index
        int i=arr.length-1;
        while(i>breakdownIndex1){
            int temp1 = arr[i];
            arr[i] = arr[breakdownIndex1+1];
            arr[breakdownIndex1+1] = temp1;

            i--;
            breakdownIndex1++;
        }

        System.out.println(Arrays.toString(arr));
     }
}
