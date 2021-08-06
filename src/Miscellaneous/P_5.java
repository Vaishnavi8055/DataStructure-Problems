package Miscellaneous;/*
 * Created by Vaishnavi Chaurasia
 * 29-Jul-21
 * 5:54 AM
 * DataStructure-Problems
 */


//Problem statement:
//        The binary number system only uses two digits, 0 and 1. Any string that represents a number in
//        the binary number system can be called a binary string. You are required to implement the
//        following function:
//        int OperationsBinaryString(char *str);
//        The function accepts a string 'str' as its argument. The string 'str' consists of binary digits
//        separated with an alphabet as follows:
//        • 'A' denotes AND operation
//        • 'B' denotes OR operation
//        • 'C' denotes XOR operation
//        You are required to calculate the result of the string 'str', scanning the string left to right, taking
//        one operation at a time, and return the same.
//        Note:
//        • No order of priorities of operations is required.
//        • Length of 'str' is odd
//        • If 'str' is NULL or None(in case of python), return -1
//        Example:
//        Input:
//        str: ICOCICIAOBI
//        Output:
//        1

import java.util.Scanner;

public class P_5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String bs = sc.next();

    }

    public static int isBinaryString(String bs){

        if(bs.length() % 2 == 0){
            return -1;
        }

        int operation = 0;
        int arr[] = new int[bs.length()];
        char AND = '&';
        char XOR = '^';
        char OR = '|';

        for(int i=0 ; i<bs.length() ; i++) {

            if(bs.charAt(i) == 'I'){
                arr[i] = '1';
            }
            if(bs.charAt(i) == 'O'){
                arr[i] = '0';
            }
        }

        return -1;
    }

}
