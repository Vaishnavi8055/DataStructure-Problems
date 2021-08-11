package Array;/*
 * Created by Vaishnavi Chaurasia
 * 09-Aug-21
 * 9:44 AM
 * DataStructure-Problems
 */

// Find the duplicate numbers from an array of N+1 Integers
public class Problem_18 {
    // Linked List Cycle method with Tortoise method (slow and fast pointers)

    public static void main(String[] args) {

        int arr[] = {2,5,9,6,9,3,8,9,7,1};

        int slowPointer = arr[0];
        int fastPointer = arr[0];

        // As it is sure there are duplicates so, cycle will be formed
        do {
            // slow will traverse one step
            slowPointer = arr[slowPointer];
            // fast will traverse 2 steps
            fastPointer = arr[arr[fastPointer]];
        }
        // Stop the traversing till slow and pointer points to same value
        while(slowPointer != fastPointer);

        fastPointer = arr[0];

        while (slowPointer != fastPointer){
            slowPointer = arr[slowPointer];
            fastPointer = arr[fastPointer];
        }

        // Print slow or Fast Pointer both are on same value i.e duplicate number
        System.out.println(slowPointer);
    }

}
