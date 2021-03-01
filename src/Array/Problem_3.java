package Array;/*
 * Created by Vaishnavi Chaurasia
 * 02-Mar-21
 * 5:12 AM
 * Interview Problems
 */

import java.util.Scanner;

// 1. Reverse an array by swapping values of array as- 1st with Nth || 2nd with 2nd-last || 3rd with 3rd-Last .........
// No extra space required
public class Problem_3 {

    public static void reverseArray(int[] arr){

        for(int i=0 ; i<arr.length/2 ; i++){
            // swapping
            int temp = arr[i];
            arr[i] = arr[arr.length - i -1];
            arr[arr.length-i-1] = temp;
        }
        System.out.println("Reverse of Array is --->");
        for (int k=0 ; k<arr.length ; k++) {
            System.out.print(arr[k] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Array Size --->");
        int arraySize = sc.nextInt();
        int array[] = new int[arraySize];

        System.out.println("Array Elements --->");
        for(int i=0 ; i<array.length ; i++)
            array[i]  = sc.nextInt();

        reverseArray(array);
    }
}
