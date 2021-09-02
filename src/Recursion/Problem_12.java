package Recursion;/*
 * Created by Vaishnavi Chaurasia
 * 02-Sep-21
 * 3:09 PM
 * DataStructure-Problems
 */

public class Problem_12 {

    public static void main(String[] args) {

        System.out.println(countZeroes(10200030));
    }

    public static int countZeroes(int N){

        if (N < 10){
            if (N == 0){
                return 1;
            }
            else
                return 0;
        }

        // Last Digit
        if(N%10 == 0)
            return  countZeroes(N/10) + 1;
        else
            return  countZeroes(N/10);
    }
}
