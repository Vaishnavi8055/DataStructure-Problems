package Array;/*
 * Created by Vaishnavi Chaurasia
 * 09-Aug-21
 * 6:55 AM
 * DataStructure-Problems
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Find the duplicate number in an array of N+1 integers
public class Problem_16 {

    public static void main(String[] args) {

        int arr[] = {4,3,2,7,8,2,3,1};
        List<Integer> l = new ArrayList<>();

        Arrays.sort(arr); //-->O(nlogn)

        for(int i=0 ; i<arr.length-1 ; i++){  //--> O(n)
            if(arr[i] == arr[i+1]){
                l.add(arr[i]);
                i++;
            }
        }

        System.out.println(l);

    }
}
