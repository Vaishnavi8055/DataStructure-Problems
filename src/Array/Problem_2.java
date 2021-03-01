package Array;/*
 * Created by Vaishnavi Chaurasia
 * 01-Mar-21
 * 4:07 AM
 * Interview Problems
 */

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

// 1. Reverse an array using extra array
public class Problem_2 {
    public static void reverseArray(int[] arr){

        int aux_array[] = new int[arr.length];

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
