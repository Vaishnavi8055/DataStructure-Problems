package Array;/*
 * Created by Vaishnavi Chaurasia
 * 01-Mar-21
 * 8:06 AM
 * Interview Problems
 */

// Find the maximum and minimum element in an array with minimum number of comparision
// T(n) = O(n)
// S(n) = O(1)
public class Problem_5 {

    public static void min_max_pairs(int arr[]) {
        int min = 0;
        int max = 0;
        int i = 0;
        // array size is even
        if (arr.length % 2 == 0) {
            min = arr[0];
            max = arr[1];
            i = 2;
        }
        // array size is odd
        else {
            min = arr[0];
            max = arr[0];
            i = 1;
        }


        //Compare in pairs

        while (i < arr.length - 1) {

            if (arr[i] > arr[i + 1]) {
                if (arr[i] > max) {
                    max = arr[i];
                }
                if (arr[i + 1] < min) {
                    min = arr[i + 1];
                }
            } else {
                if (arr[i] < min) {
                    min = arr[i];
                }
                if (arr[i + 1] > max) {
                    max = arr[i + 1];
                }
            }

            i += 2; // As elements are compaired in pairs
        }

        System.out.println("Max - " + max + "," + "Min - " + min);
    }

    public static void main(String[] args) {
        int arr[] = {5, 3, 7, 80, 4};
        min_max_pairs(arr);
    }
}
