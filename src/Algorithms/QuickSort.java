package Algorithms;/*
 * Created by Vaishnavi Chaurasia
 * 07-Sep-21
 * 5:45 PM
 * DataStructure-Problems
 */

import java.util.Arrays;

// quicksort
public class QuickSort {

    public static void quickSort(int arr[] , int startIndex , int endIndex){

        if(startIndex >= endIndex){
            return;
        }
        int pivotPos = Partition(arr , startIndex , endIndex);
        quickSort(arr , startIndex , pivotPos-1);
        quickSort(arr , pivotPos+1 , endIndex);
    }

    public static int Partition(int arr[] , int startIndex , int endIndex){

        // FirstElement as Pivot
        int pivot = arr[startIndex];

        // count elements less than or equal to pivot
        int count = 0;
        for(int i=startIndex+1 ; i<=endIndex ; i++){
            if(arr[i] <= pivot)
                count++;
        }

        int pivotIndex = startIndex + count;

        swap(arr , startIndex , pivotIndex);

        int i=startIndex , j=endIndex;

        while(i<pivotIndex && j>pivotIndex){

            if(arr[i]<=arr[pivotIndex]){
                i++;
            }
            else if(arr[i] > arr[pivotIndex]){
                j--;
            }
            else{
                swap(arr , i , j);
                i++;
                j--;
            }
        }
       return pivotIndex;
    }

    public static void swap(int arr[] , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {

        int arr[] = {5, 4, 3, 8, 6, 6};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
