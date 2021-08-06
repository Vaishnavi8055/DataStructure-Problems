package Array;/*
 * Created by Vaishnavi Chaurasia
 * 07-Aug-21
 * 6:09 AM
 * DataStructure-Problems
 */

import java.util.Arrays;

// Sort the array of 0's 1's and 2's without extra space or sorting algorithm
public class Problem_7 {

    public static void main(String[] args) {
        int arr[] = {1,0,2,2,0,1,0};
        sortColors(arr);
    }

    public static void sortColors(int[] nums) {

        //Logic - Put 0's from the starting of array
        //        Put 2's at the end of the array
        //        Automatically 1's will be in the middle

        int n = nums.length;
        int start = 0 , end = n-1 , i=0 , j=n-1;

        while(i<n) {
            if (nums[i] == 0) {
                nums[i] = nums[start];
                nums[start++] = 0;
            }
            i++;
        }

        while(j>=0){
            if(nums[j] == 2){
                nums[j] = nums[end];
                nums[end--] = 2;
            }
            j--;
        }
        System.out.print(Arrays.toString(nums));
    }
}
