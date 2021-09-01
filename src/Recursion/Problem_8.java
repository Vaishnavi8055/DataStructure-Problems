package Recursion;/*
 * Created by Vaishnavi Chaurasia
 * 01-Sep-21
 * 8:26 PM
 * DataStructure-Problems
 */

// First Index of Number
public class Problem_8 {

    public static void main(String[] args) {

        int arr[] = {1,2,5,3,4,3};
        int searchKey = 0;

        System.out.println(firstIndex(arr , searchKey));
    }

    // Method overriding
    private static int firstIndex(int arr[] , int startIndex , int searchKey){

        if(startIndex == arr.length){
            return -1;
        }

        if(arr[startIndex] == searchKey)
            return startIndex;

       return firstIndex( arr , startIndex+1 , searchKey);
    }

    public static int firstIndex(int arr[] , int searchKey){

      return firstIndex(arr , 0 , searchKey);
    }

}
