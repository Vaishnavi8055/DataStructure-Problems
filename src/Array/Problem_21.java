package Array;/*
 * Created by Vaishnavi Chaurasia
 * 14-Aug-21
 * 9:58 AM
 * DataStructure-Problems
 */

// Count Inversions of Array
public class Problem_21 {

    public static void main(String[] args) {

        int arr[] = {8,4,2,1};
        int count_inversions = 0;

        for(int i=0 ; i<arr.length ; i++){
            for(int j=i+1 ; j<arr.length ; j++){
                if(arr[i] > arr[j])
                    count_inversions++;
            }
        }
        System.out.println(count_inversions);
    }
}
