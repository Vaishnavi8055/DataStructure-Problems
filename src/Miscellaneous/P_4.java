package Miscellaneous;/*
 * Created by Vaishnavi Chaurasia
 * 29-Jul-21
 * 5:48 AM
 * DataStructure-Problems
 */

import java.util.Arrays;
import java.util.Scanner;

public class P_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String sentence = sc.next();

        String words[] = sentence.split("\\s+");
        System.out.println(Arrays.toString(words));


        if (words.length % 2 == 0) {
            System.out.println("There are even number of words !!!!!!!");
        } else {
            int left = 0;
            int right = words.length - 1;

            while (left < right) {
                String temp = words[left];
                words[left] = words[right];
                words[right] = temp;

                left++;
                right--;
            }
            System.out.println(Arrays.toString(words));
        }
    }
}