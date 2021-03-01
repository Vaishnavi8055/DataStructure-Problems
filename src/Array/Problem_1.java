package Array;/*
 * Created by Vaishnavi Chaurasia
 * 18-Feb-21
 * 00:26 AM
 * Interview Problems
 */

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

// 1. Reverse an array by using Built In method - Collections.reverse(List)
public class Problem_1 {

    public static void reverseArray(Integer[] arr){
        // convert array into list by - Arrays.asList(array)
        Collections.reverse(Arrays.asList(arr));

        System.out.println("Reverse of Array is --->");
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Array Size --->");
        int arraySize = sc.nextInt();
        Integer array[] = new Integer[arraySize];

        System.out.println("Array Elements --->");
        for(int i=0 ; i<array.length ; i++)
          array[i]  = sc.nextInt();

        reverseArray(array);
    }
}
