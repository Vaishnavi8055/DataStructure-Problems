package Recursion;/*
 * Created by Vaishnavi Chaurasia
 * 02-Sep-21
 * 2:45 PM
 * DataStructure-Problems
 */

// Multiplication (Recursive)
public class Problem_11 {

    public static void main(String[] args) {

        System.out.println(multiplyUsingAddition(3,5));
    }

    public static int multiplyUsingAddition(int M , int N){

        if(M == 0) {
            return 0;
        }

        int ans = N +  multiplyUsingAddition( M-1 ,  N);

        return ans;
    }
}
