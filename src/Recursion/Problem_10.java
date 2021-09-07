package Recursion;/*
 * Created by Vaishnavi Chaurasia
 * 02-Sep-21
 * 2:20 PM
 * DataStructure-Problems
 */

import java.util.Arrays;

// Find all Indices of a number
public class Problem_10 {


    public static void main(String[] args) {

        int arr[] = {1,2,5,3,4,3};
        int searchKey = 3;

        System.out.println(Arrays.toString(allIndices(arr, searchKey)));
    }

    private static int[] allIndices(int arr[] , int startIndex , int searchKey , int ans[] , int i){

        if(startIndex == arr.length)
            return ans;

        if (arr[startIndex] == searchKey)
            ans[i++] = startIndex;

      return  allIndices(arr ,  startIndex+1 , searchKey ,  ans , i);
    }

    public static int[] allIndices(int arr[] , int searchKey){

        int ans[] = new int[arr.length + 1];

      return   allIndices(arr , 0 , searchKey , ans , 0);

    }
}
