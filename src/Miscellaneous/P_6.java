package Miscellaneous;/*
 * Created by Vaishnavi Chaurasia
 * 08-Aug-21
 * 8:32 AM
 * DataStructure-Problems
 */

// Sort 0 and 1 without using extra array and in single traversal
import java.util.Arrays;

public class P_6 {

    public static void main(String[] args) {

        int arr[] = {1,0,1,0,0,0,1,0,1};
        int n= arr.length;
        int i=0 ; int start=0;

        while(start<n && i<n){

            if(arr[i] == 0){
                arr[i] = arr[start];
                arr[start++] = 0;
            }
            else{
                i++;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
