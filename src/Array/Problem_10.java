package Array;/*
 * Created by Vaishnavi Chaurasia
 * 08-Aug-21
 * 12:44 AM
 * DataStructure-Problems
 */

// Find a missing and repeating (twice) number between 1 to n (inclusive)

import java.util.Arrays;

public class Problem_10 {
    public static void main(String[] args) {

        // Missing = 4 , Repeating = 5
        int arr[] = {1, 3, 5, 5, 2, 6};
        int n = arr.length;

        int temp[] = new int[n+1];  //-->O(n) (space)

        for(int i=0 ; i<n ; i++){  // -> O(n)
            temp[arr[i]]++;
        }

        System.out.println(Arrays.toString(temp));

        int missing = 0, repeating = 0;

        for(int i=1 ; i<temp.length ; i++){ //-> O(n)
            if(temp[i] == 0)
                missing = i;
            if(temp[i] == 2)
                repeating = i;
        }
        System.out.println(missing + "," + repeating);
    }
}
