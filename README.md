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
              
8. ### Maximum Subarray (contigious or continuous) Sum 
       By using 3 loops
              T(n) = O(n^3)
              
     
     
      
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

   
          
