# HW4
## Problem 1:
We have discussed insertion sort as an algorithm. Now that we know how to analyze algorithms AND asymptotic notation, let's revisit Insertion Sort!

You may refer to class slides/ online resources to refresh your memory on the insertion sort algorithm. 

For insertion sort, what is the 

Best Case
Average Case
Worst Case
Time complexity? Show your reasoning and work. 
### Answer:
Insertion works by traversing through every element of a list and shifting it to the left while it is smaller than its left neighbor. The traversal takes n time, where n is the length of the list. Shifting each element to the left also takes n time, as doing so requires traversing backwards through the list. If the list is unsorted, insertion sort as a whole would take n^2 time, but if the list were to be sorted already, it would only take n time because no elements would be shifted.

insertionSort(list){
    for every element{// n time
        while left > this{// n time
            swap this and left
        }
    }
}

Best Case: O(n)
Average Case: O(n^2)
Worst Case: O(n^2)

## Problem 2:
Below is the pseudocode to perform matrix multiplication that we discussed in HW3. 

MATRIX_MULTIPLY(A, B): 
  if columns(A) ≠ rows(B): 
    raise ValueError("Matrix multiplication is not defined.") 

  rows_A ← number of rows in A 
  cols_A ← number of columns in A 
  cols_B ← number of columns in B 
  result ← matrix of size rows_A x cols_B filled with zeros 

  for i from 1 to rows_A do: 
    for j from 1 to cols_B do: 
    sum ← 0 
      for k from 1 to cols_A do: 
        sum ← sum + A[i][k] * B[k][j] 
      result[i][j] ← sum return result

For the above pseudocode, what is the 

Best Case
Average Case
Worst Case
Time complexity? Show your reasoning and work. 
### Answer:
represent length of rows_A as i
represent length of cols_B as j
represent length of cols_A as k

traverses through rows_A (i time)
for every element of rows_A, traverse through cols_B (j time)
for every element of cols_B, traverse through cols_A (k time)
for every element of cols_A, update a value (constant time)

if cols_A != rows_B or any dimension = 0, cannot perform algorithm, exits (constant time)
else takes ijk time

Best Case: O(1)
Average Case: O(ijk)
Worst Case: O(ijk)