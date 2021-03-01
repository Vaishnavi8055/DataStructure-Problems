package Array;/*
 * Created by Vaishnavi Chaurasia
 * 01-Mar-21
 * 4:30 AM
 * Interview Problems
 */

// 1. Reverse an array by using auxiliary array
// S(n) = O(n) ---> extra array

import java.util.Scanner;

public class Problem_2 {

    public static void reverseArray(int[] arr){
       int aux_array[] = new int[arr.length];
       int size = arr.length;
       int j=size-1;

       for (int i=0 ; i<size ; i++){
           aux_array[j] = arr[i];
           j--;
       }
        System.out.println("Reverse of Array is --->");
       for (int k=0 ; k<arr.length ; k++) {
           System.out.print(aux_array[k] +" ");
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
