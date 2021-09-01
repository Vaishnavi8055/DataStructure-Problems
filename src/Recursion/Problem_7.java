package Recursion;/*
 * Created by Vaishnavi Chaurasia
 * 01-Sep-21
 * 8:00 PM
 * DataStructure-Problems
 */

// Check Number in array
public class Problem_7 {

    public static void main(String[] args) {

        int arr[] = {1,5,3,78};
        int searchKey = 8;

        System.out.println(isElementPresent(arr , 0 , searchKey));
    }

    public static boolean isElementPresent(int arr[] , int startIndex , int searchKey){

        // the order of base cases must be same here
        if (startIndex == arr.length)
            return false;

        if(arr[startIndex] == searchKey){
            return true;
        }

        return isElementPresent(arr , startIndex+1 , searchKey);

    }
}
