package Recursion;/*
 * Created by Vaishnavi Chaurasia
 * 31-Aug-21
 * 11:50 PM
 * DataStructure-Problems
 */

// Check whether array is sorted or not by using recursion
public class Problem_5 {

    public static void main(String[] args) {

        int arr[] = {1,6,5,7};

        System.out.println(isArraySorted(arr));
    }

    public static boolean isArraySorted(int arr[]){

        if(arr.length <= 1)
            return true;

        if(arr[0] > arr[1])
            return false;

        int smallAns[] = new int[arr.length - 1];

        for(int i=1 ; i<arr.length ; i++){
            smallAns[i-1] = arr[i];
        }

       return isArraySorted(smallAns);

    }
}
