package Array;/*
 * Created by Vaishnavi Chaurasia
 * 07-Aug-21
 * 8:46 AM
 * DataStructure-Problems
 */

import java.util.Arrays;
import java.util.Scanner;

public class Problem_8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];
        int start = 0 , end = n-1;

        while(start<=end) {
            for (int i = 1; i <= n; i++) {
                if (i % 2 != 0) {
                    arr[start++] = i;
                }
                else{
                    arr[end--] = i;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
