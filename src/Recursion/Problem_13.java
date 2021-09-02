package Recursion;/*
 * Created by Vaishnavi Chaurasia
 * 02-Sep-21
 * 6:56 PM
 * DataStructure-Problems
 */

// Geometric Sum
public class Problem_13 {

    public static void main(String[] args) {

        System.out.println( geometricSum(3));
    }

    public static double geometricSum(int k){

        if(k == -1)
            return 0;

        double sum =  (1 / Math.pow(2,k) + geometricSum(k-1));
      //  System.out.println(sum);

        return sum;
    }
}
