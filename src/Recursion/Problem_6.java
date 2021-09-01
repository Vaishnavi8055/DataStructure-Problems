package Recursion;/*
 * Created by Vaishnavi Chaurasia
 * 01-Sep-21
 * 6:13 PM
 * DataStructure-Problems
 */

// Sum of Array
public class Problem_6 {

    public static void main(String[] args) {

        int arr[] = {1,2,3};

        System.out.println(sumOfArray(arr,  0));

    }

    public static int sumOfArray(int arr[] ,  int startIndex ) {

        if(startIndex == arr.length)
            return 0;


        return arr[startIndex] + sumOfArray(arr ,   startIndex+1 );

    }
}
