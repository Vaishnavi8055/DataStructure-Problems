package Array;/*
 * Created by Vaishnavi Chaurasia
 * 12-Aug-21
 * 9:23 AM
 * DataStructure-Problems
 */

import java.util.ArrayList;
import java.util.List;

// Given number of rows print pascals triangle
public class Problem_19 {

    public static void main(String[] args) {

        int numRows = 5;
        List<List<Integer>> res = new ArrayList<List<Integer>>();      // ---> O(n)
        ArrayList<Integer> row , prev = null;

        // i is for parent List which contains all rows in individual lists
        for(int i=0 ; i< numRows ; i++){      // ---> O(n)
            row = new ArrayList<>();
            // j iterates to each row child list element
            for(int j=0 ; j<=i ; j++)
                // if column number is first (0) or last (i)
                if(j==0  || j==i){
                    row.add(1);
                }
                else{
                    row.add(prev.get(j-1)+prev.get(j));
                }

            prev = row;
            res.add(row);

        }
        System.out.println(res);
    }
}

