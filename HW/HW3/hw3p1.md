# HW 3

## Problem 1:
We have discussed insertion sort as an algorithm. Now that we know how to analyze algorithms, let's apply the same analysis to Insertion Sort!

You may refer to class slides/ online resources to refresh your memory on the insertion sort algorithm. 
## Time Complexity Analysis:
### Insertion Sort Pseudocode (from visualgo.net):
mark first element as sorted (LINE 1)
for each unsorted element X (LINE 2)
    'extract' the element X (LINE 3)
    for j = lastSortedIndex down to 0 (LINE 4)
        if current element j > X (LINE 5)
            move sorted element to the right by 1 (LINE 6)
        break loop and insert X here (LINE 7)
### Analysis:
1. LINE 1 takes 1 time
2. LINE 2 takes n + 1 time
3. LINE 3 takes n time
4. LINE 4 takes n(n+1) time
5. LINE 5 takes n^2 time
6. LINE 6 takes n^2 time
7. LINE 7 takes n^2 time
SUM = 1 + n + 1 + n + n^2 + n + n^2 + n^2 + n^2 = 4n^2 + 3n + 2
Big O: 4n^2 + 3n^2 + 2n^2 = 9(n^2); O(n^2)
Omega: 4n^2 + 3n + 2 reduced to n^2; Omega(n^2)
functions of Big O and Omega are equal; Theta(n^2)