package Algorithms;/*
 * Created by Vaishnavi Chaurasia
 * 07-Sep-21
 * 12:19 PM
 * DataStructure-Problems
 */

// Merge Sort -
// 1. mergesort(Part1)
// 2. mergesort(Part2)
// 3. merge()



import java.util.Arrays;

public class MergeSort {

    public static void mergeSort(int arr[] , int startIndex , int endIndex){

        // if there is one element or no elements present return
        if (startIndex >= endIndex)
            return;

        // Divide in two equal halves - P1 & P2
        int middle = (startIndex + endIndex) / 2;

        //P1
        mergeSort(arr , startIndex , middle);
        //P2
        mergeSort(arr , middle+1 , endIndex);
        merge(arr , startIndex , endIndex);
    }

    public static void merge(int arr[] , int startIndex , int endIndex){

        int middle = (startIndex + endIndex) / 2;

        int tempArray[] = new int[endIndex - startIndex + 1];

        int i=startIndex , j= middle+1 , k=0;

        while(i<=middle && j<=endIndex){

            if(arr[i] <= arr[j]){
                tempArray[k] = arr[i];
                i++;
                k++;
            }
            else{
                tempArray[k] = arr[j];
                j++;
                k++;
            }
        }

        while(i<=middle){
            tempArray[k] = arr[i];
            i++;
            k++;
        }

        while(j<=endIndex){
            tempArray[k] = arr[j];
            j++;
            k++;
        }

        for(int index=0 ; index<tempArray.length ; index++){
            arr[index+startIndex] = tempArray[index];
        }

    }

    public static void main(String[] args) {

        int arr[] = {5, 4, 3, 2, 6, 6};
        mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
