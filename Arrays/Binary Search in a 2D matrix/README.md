## Problem Statement

Search for an element in a 2D matrix sorted row-wise.


## Solution

**Approach**

Use Binary Search to find the element since the matrix is sorted row-wise

There are 2 ways to do it :

1. Copy all elements of matrix into a 1D array and perform binary search 

2. In a 2D array to implement this without using an array of size m X n to store the elements of the matrix, the low will be 0 and high will be m*n-1 initially and then everytime we need to use the middle index(low+high/2) value to calculate the row and the column. It can be simply done by row = middle / no. of columns & column = middle % no. of columns. 

## Example

Input: **1,3,5,7**
       **10,11,16,20**
       **23,30,34,50**

Element to search: **23**

Procedure:

Here m = 3 , n = 4
So low=0 , high=11

Middle element: **11** 
mid = (0+11)/2 = 5
arr[5/4][5%4] = arr[1][1] = 11
11 < 23 , so low = 5+1 = 6

Middle element: **23** 
mid = (6+11)/2 = 8
arr[8/4][8%4] = arr[2][0] = 23
23 = 23 , so true returned.
Thus, element present in matrix.

Output: **Element present in matrix.**

## Implementation/Code

- [Java](Arrays/Binary Search in a 2D matrix/Solution.java)

