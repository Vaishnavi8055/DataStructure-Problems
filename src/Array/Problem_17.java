package Array;/*
 * Created by Vaishnavi Chaurasia
 * 09-Aug-21
 * 9:25 AM
 * DataStructure-Problems
 */

import java.util.ArrayList;
import java.util.List;

public class Problem_17 {

    public static void main(String[] args) {

        int arr[] = {4, 3, 2, 7, 8, 2, 3, 1};

        int count[] = new int[arr.length+1]; //--> O(n)
        List<Integer> l = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) { // ---> O(n)
            count[arr[i]]++;
        }

        for(int i=0 ; i<count.length ; i++){  //--> O(n)
            if(count[i] == 2)
                l.add(i);
        }

        System.out.println(l);
    }
}
