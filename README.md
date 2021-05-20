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
                
      
      
   
          
