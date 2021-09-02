package Recursion;/*
 * Created by Vaishnavi Chaurasia
 * 01-Sep-21
 * 10:39 PM
 * DataStructure-Problems
 */

// Find the last Index of given number
public class Problem_9 {

    public static void main(String[] args) {

        int arr[] = {1,2,5,3,4,3};
        int searchKey = 3;

        System.out.println(lastIndex(arr , searchKey));
    }

    // Method overriding
   /* private static int lastIndex(int arr[] , int endIndex , int searchKey){

        if(endIndex == -1){
            return -1;
        }

        if(arr[endIndex] == searchKey)
            return endIndex;

        return lastIndex( arr , endIndex-1 , searchKey);
    }

    public static int lastIndex(int arr[] , int searchKey){

        return lastIndex(arr , arr.length-1 , searchKey);

    }*/

    private static int lastIndex(int arr[] , int startIndex , int searchKey){

        if(startIndex == arr.length){
            return -1;
        }

        int ans =  lastIndex( arr , startIndex+1 , searchKey);

        if(ans != -1)
            return ans;

        if(arr[startIndex] == searchKey)
            return startIndex;
        else
            return -1;
    }

    public static int lastIndex(int arr[] , int searchKey){

        return lastIndex(arr , 0 , searchKey);

    }
}
