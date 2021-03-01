package Array;/*
 * Created by Vaishnavi Chaurasia
 * 02-Mar-21
 * 5:57 AM
 * Interview Problems
*/

import java.util.Scanner;

// Find the maximum and minimum element in an array with minimum number of comparision
public class Problem_4 {

    public static void max_min_Array(int[] arr){
         int size = arr.length;

         int max_element = 0;
         int min_element = 0;

         // when size of array is 1
         if (size == 1){
             max_element = arr[0];
             min_element = arr[0];
         }

         // when there are more than 1 element
        if (arr[0] > arr[1]){
            max_element = arr[0];
            min_element = arr[1];
        }
        else {
            max_element = arr[1];
            min_element = arr[0];
        }

        for (int i=2 ; i<size ; i++){
            if (arr[i]>max_element){
                max_element = arr[i];
            }
            else if (arr[i]<min_element){
                min_element = arr[i];
            }
        }

        System.out.println("Maximum and minimum element in an Array is --->");

        System.out.println("Maximum element in array is:- " + max_element);
        System.out.println("Minimum element in array is:- " + min_element);

    }

public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Array Size --->");
        int arraySize = sc.nextInt();
        int array[] = new int[arraySize];

        System.out.println("Array Elements --->");
        for(int i=0 ; i<array.length ; i++)
            array[i]  = sc.nextInt();

        max_min_Array(array);
    }
}
