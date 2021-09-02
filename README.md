# DataStructure-Problems
This repository will have solutions of problems asked in interview. 

## A. Arrays
      
 1. ### Reverse an Array (Problem_1 , Problem_2 , Problem_3)
        Using Built In method 
            Collections.reverse(Arrays.asList(arr)) 
        Using Auxillary Array (Auxillary Space)
           T(n) -> O(n) & S(n) -> O(n)
        By Swapping First and Last Element of Array one by one (Using two pointers)
           T(n) -> O(n)
  
 2. ### Find the maximum and minimum element in an array (Problem_4 , Problem_5)
        By Simple Linear Search of max and min element using two variables and comparing each element one by one.
          T(n) -> O(n) & S(n) -> O(1)
        By comparing in pairs of elements in an array.
          It is best method among others in terms of number of comparisions.
          T(n) -> O(n) & S(n) -> O(1)
         
 3. ### Find Kth maximum and minimum element in an array (Problem_6)
        Using Built In method - Arrays.sort(array)
          T(n) = O(nlogn)
        
 4. ### Sort the array of 0's 1's and 2's without extra space or sorting algo (Problem_7)
        By sorting Algorithm or built-In function
          T(n) = O(nlogn)
          S(n) = O(1)
        By using Counting Sort
          T(n) = O(n) + O(n) = O(2n)
        By using Switch case or Dutch National Flag Algorithm
           T(n) = O(n)
           S(n) = O(1)
          
 5. ### Arrange Numbers in Array (Problem_8)
        
        You have been given an empty array(ARR) and its size N. The only input taken from the user will be N and you need not worry about the array.
        Your task is to populate the array using the integer values in the range 1 to N(both inclusive) in the order - 1,3,.......4,2.
        
        Note:
        You need not print the array. You only need to populate it.
        Input Format :
        The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.
        
        The first and the only line of each test case or query contains an integer 'N'.
        Output Format :
        For each test case, print the elements of the arra/listy separated by a single space.
        
        Output for every test case will be printed in a separate line.
        Constraints :
        1 <= t <= 10^2
        0 <= N <= 10^4
        
        Time Limit: 1sec
        Sample Input 1 :
        1
        6
        Sample Output 1 :
        1 3 5 6 4 2
        Sample Input 2 :
        2
        9
        3
        Sample Output 2 :
        1 3 5 7 9 8 6 4 2
        1 3 2
       
6. ### Find the missing and repeating element (twice) from the array given (Problem_9 , Problem_10)
       By Sorting the array
                T(n) = O(nlogn) + O(n)
                S(n) = O(1)
       By using extra rray to store Frequency of each element from input array
                T(n) = O(n) + O(n) = O(2n) 
                S(n) = O(n)
    
7. ### Merge two sorted Arrays
       By using temporary array of size of both the arrays i.e n1 & n2
              T(n) = O(n1 + n2)
              S(n) = O(n1 + n2)
              
              ------
              
8. ### Maximum Subarray (contiguous or continuous) Sum 
       By using 3 loops
              T(n) = O(n^3)
       By Kadane's Algorithm - Take sum of elements till its positive else return max negative element
              T(n) = O(n)
              S(n) = O(1)
              
9. ### Set matrix zeroes
     **First Ask the Interviewer What are the ranges of values in the matrix** 
        
        If ans is - All values will be  positive on the sides of zero
          -----
10. ### Find the duplicates from the array of N+1 Integers (Problem_16 , Problem_17 , Problem_18)
         By sorting the array and checking adjacent elements
                  T(n) = O(n) + O(nlogn) 
                  S(n) = O(1)
         By using counting sot algorithm
                  T(n) = O(n)
                  S(n) = O(n)
         By LinkedList Cycle method
                 T(n) = O(n)
                 S(n) = O(1)
                 
11. ### Pascals Triangle
      **In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:**
          
        Interviewer can ask 3 types of ques based on this -
        
        a. Given Number of rows i.e N=5 and print the first N rows of Pascals Triangle
                  T(n) = O(n)  S(n) = O(n)
                  
        b. Given N =5, print the Nth row only 
             --> Approach-1 => Find nth element for each row and column by using below formula
                              T(n) = O(n^2)    S(n) = O(n^2)
             --> Approach-2 => Find nth element for each row and column optimally
                              T(n) = O(n)     S = O(1)
                              
        c. Given row number and column number i.e r & c, print the element present at that rownumber & column number
          `  --> Formula :-  r-1 C c-1 (C = combination - nCr)
                 example :- r=4 c=3 
                 element = 4-1 C 3-1 = 3 C 2 = 3*2 / 2*1 = 3 (answer)

##### **nCr Shortcut** - make equal number of terms in denominator as well as numerator

1. **4C3** - 4*3*2 / 3*2*1 = 4/1 = 4 
2. **7C2** - 7*6 / 2*1 = 7*3 = 21

12. ### Next Permutation

        Input - 1 3 5 4 2  -  1 4 2 3 5
                   
         BREAKDOWN ----->  5    \
                         3   4   \  INCREASING ORDER
                       1       2  \
         
         step 1 - Find the breakdown point
                ---> Linear traverse the array from back 
                     find A[i] < A[i+1] , index1 = i+1
                          T(n) = O(n)         
                          
                ---> Again Linearly Traverse the array from back to get the slightly greater than that element ,
                      find A[index1] < A[index2] ans swap them , index1 = i+1     
                           T(n) = O(n)
                           
                ---> Again Traverse the array from back and reverse the right half
                            T(n) = O(n)
                            
                          T(n) = O(n)   S(n) = O(n)
                          
8. ### Merge the overlapping Intervals
    **First Ask the Interviewer whether the Intervals are sorted or not** 
       
       KARNA HAI .....
       
              
    
     
      
<hr>

## B. Recursion

   <ol start="1">
         <li>Base Case</li> 
         <li>Smaller Problem Solution</li>
         <li>Processing steps</li>
   </ol>
        
   1. ### Calculate Power (Problem_1)
        
          Write a program to find x to the power n (i.e. x^n). Take x and n from the user. You need to return the answer.
          Do this recursively.
               
               Input format :
               Two integers x and n (separated by space)
               Output Format :
               x^n (i.e. x raise to the power n)
               
               Constraints :
               1 <= x <= 30
               0 <= n <= 30
               
               Sample Input 1 :
                3 4
               Sample Output 1 :
               81
               Sample Input 2 :
                2 5
               Sample Output 2 :
               32
    
  2. ### Print Numbers (Problem_2)
            
          Given is the code to print numbers from 1 to n in increasing order recursively. But it contains few bugs that you need to rectify such that all the test cases pass.
          
          Input Format :
           Integer n
           
          Output Format :
           Numbers from 1 to n (separated by space)
            
          Constraints :
           1 <= n <= 10000
           Sample Input 1 :
            6
           Sample Output 1 :
           1 2 3 4 5 6
           Sample Input 2 :
            4
           Sample Output 2 :
           1 2 3 4
           
  3. ### Count Number of Digits (Problem_3)
               
  4. ### Find Nth Fibonacci Number (Problem_4)            
   
  5. ### Check whether array is sorted or not (Problem_5) 
   
  6. ### Sum of Array (Problem_6)
   
           Given an array of length N, you need to find and return the sum of all elements of the array.
           Do this recursively.
           
           Input Format :
           Line 1 : An Integer N i.e. size of array
           Line 2 : N integers which are elements of the array, separated by spaces
           
           Output Format :
           Sum
           
           Constraints :
           1 <= N <= 10^3
           Sample Input 1 :
           3
           9 8 9
           Sample Output 1 :
           26
           Sample Input 2 :
           3
           4 2 1
           Sample Output 2 :
           7   
   
  7. ### Check whether given number present in the array or not (Problem_7)
      
          Given an array of length N and an integer x, you need to find if x is present in the array or not. Return true or false.
          Do this recursively.
          
          Input Format :
          Line 1 : An Integer N i.e. size of array
          Line 2 : N integers which are elements of the array, separated by spaces
          Line 3 : Integer x
          
          Output Format :
          'true' or 'false'
          
          
          Constraints :
          1 <= N <= 10^3
          
          Sample Input 1 :
          3
          9 8 10
          8
          Sample Output 1 :
          true
          Sample Input 2 :
          3
          9 8 10
          2
          Sample Output 2 :
          false
          
    
  8. ### Find the first index of given number (Problem_8)
      
          Given an array of length N and an integer x, you need to find and return the first index of integer x present in the array. Return -1 if it is not present in the array.
          First index means, the index of first occurrence of x in the input array.
          Do this recursively. Indexing in the array starts from 0.
          Input Format :
          Line 1 : An Integer N i.e. size of array
          Line 2 : N integers which are elements of the array, separated by spaces
          Line 3 : Integer x
          Output Format :
          first index or -1
          Constraints :
          1 <= N <= 10^3
          Sample Input :
          4
          9 8 10 8
          8
          Sample Output :
          1
          
  9. ### Find the first index of given number (Problem_9)
         
          Given an array of length N and an integer x, you need to find and return the last index of integer x present in the array. Return -1 if it is not present in the array.
          Last index means - if x is present multiple times in the array, return the index at which x comes last in the array.
          You should start traversing your array from 0, not from (N - 1).
          Do this recursively. Indexing in the array starts from 0.
          Input Format :
          Line 1 : An Integer N i.e. size of array
          Line 2 : N integers which are elements of the array, separated by spaces
          Line 3 : Integer x
          Output Format :
          last index or -1
          Constraints :
          1 <= N <= 10^3
          Sample Input :
          4
          9 8 10 8
          8
          Sample Output :
          3 
          
  10. ### Find All Indices of Number (Problem_10)
           
            Given an array of length N and an integer x, you need to find all the indexes where x is present in the input array. Save all the indexes in an array (in increasing order).
            Do this recursively. Indexing in the array starts from 0.
            Input Format :
            Line 1 : An Integer N i.e. size of array
            Line 2 : N integers which are elements of the array, separated by spaces
            Line 3 : Integer x
            Output Format :
            indexes where x is present in the array (separated by space)
            Constraints :
            1 <= N <= 10^3
            Sample Input :
            5
            9 8 10 8 8
            8
            Sample Output :
            1 3 4   
              
 12. ### Count Zeroes (Problem_12)
 
          Given an integer N, count and return the number of zeros that are present in the given integer using recursion.
           Input Format :
            Integer N
            
            Output Format :
             Number of zeros in N
             
            Constraints :
              0 <= N <= 10^9
              
            Sample Input 1 :
              10204
            Sample Output 1 :
               2
            Sample Input 2 :
              708000
            Sample Output 2 :
               4
               
 13. ### Geometric Sum (Problem_13)
    
         Given k, find the geometric sum i.e.
         1 + 1/2 + 1/4 + 1/8 + ... + 1/(2^k) 
         using recursion.
         
         Input format :
         Integer k
         
         Output format :
         Geometric sum
         
         Constraints :
         0 <= k <= 1000
         
         Sample Input 1 :
         3
         Sample Output 1 :
         1.875
         Sample Input 2 :
         4
         Sample Output 2 :
         1.93750
         
 14. ### Check Palindrome (recursive)
 
          Check whether a given String S is a palindrome using recursion. Return true or false.
           Input Format :
                String S
                Output Format :
                'true' or 'false'
                Constraints :
                0 <= |S| <= 1000
                where |S| represents length of string S.
                Sample Input 1 :
                racecar
                Sample Output 1:
                true
                Sample Input 2 :
                ninja
                Sample Output 2:
                false
      
 15. ### Sum of Digits
 
          Write a recursive function that returns the sum of the digits of a given integer.
          Input format :
          Integer N
          Output format :
          Sum of digits of N
          Constraints :
          0 <= N <= 10^9
          Sample Input 1 :
          12345
          Sample Output 1 :
          15
          Sample Input 2 :
          9
          Sample Output 2 :
          9
     
<hr> 

## COMPANY WISE CODING QUESTIONS

### 1. Accenture

    a. Problem statement:
            The binary number system only uses two digits, 0 and 1. Any string that represents a number in
            the binary number system can be called a binary string. You are required to implement the
            following function:
            int OperationsBinaryString(char *str);
            The function accepts a string 'str' as its argument. The string 'str' consists of binary digits
            separated with an alphabet as follows:
            • 'A' denotes AND operation
            • 'B' denotes OR operation
            • 'C' denotes XOR operation
            You are required to calculate the result of the string 'str', scanning the string left to right, taking
            one operation at a time, and return the same.
            Note:
            • No order of priorities of operations is required.
            • Length of 'str' is odd
            • If 'str' is NULL or None(in case of python), return -1
            Example:
            Input:
            str: ICOCICIAOBI
            Output:
            1

   
          
