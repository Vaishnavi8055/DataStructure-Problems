# DataStructure-Problems
This repository will have solutions of problems asked in interview. 

## A. Arrays
      
 1. ### Reverse an Array
     -  Using Built In method - **Collections.reverse(Arrays.asList(arr))**
     -  Using **Auxillary Array** (Auxillary Space)
         - T(n) -> O(n) & S(n) -> O(n)
     -  By **Swapping First and Last Element of Array** one by one (Using two pointers)
         - T(n) -> O(n)
  
 2. ### Find the maximum and minimum element in an array
      -  By **Simple Linear Search** of max and min element using two variables and comparing each element one by one.
         - T(n) -> O(n) & S(n) -> O(1)
      -  By **comparing in pairs** of elements in an array.
         - It is best method among others in terms of number of comparisions.
         - T(n) -> O(n) & S(n) -> O(1)
         
 3. ### Find Kth maximum and minimum element in an array
       - Using Built In method - **Arrays.sort(array)**
         - T(n) = O(nlogn)
        
 4. ### Sort the array of 0's 1's and 2's without extra space or sorting algo
       - By sorting Algorithm or built-In function
         - T(n) = O(nlogn)
         - S(n) = O(1)
       - By using Counting Sort
         - T(n) = O(n) + O(n) = O(2n)
       -  By using Switch case or Dutch National Flag Algorithm
          - T(n) = O(n)
          - S(n) = O(1)
        
         
         
                

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

   
          
