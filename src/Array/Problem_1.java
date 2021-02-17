package Array;/*
 * Created by Vaishnavi Chaurasia
 * 18-Feb-21
 * 00:26 AM
 * Interview Problems
 */

import java.util.Arrays;
import java.util.Collections;

// 1. Reverse an array by using Built In method
public class Problem_1 {

    public void reverseArray(int arr[]){
        Collections.reverse(Arrays.asList(arr));
        System.out.println(Arrays.asList(arr));
    }
}
