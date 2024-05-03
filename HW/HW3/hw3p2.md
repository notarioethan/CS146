# HW 3

## Problem 2:
Below is the pseudocode to perform matrix multiplication, given two matrices A and B. 

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

## Time Complexity Analysis:
- first line takes 1 time
- next four lines take 1 time each; 4 time
    - rows_A = n, cols_B = m, cols_A = k
- next line takes n + 1 time
- next takes n(m + 1) time
- next takes nm time
- next takes nm(k + 1) time
- next takes nmk time
- next takes nm time
- converting all variables to n, we get: 5 + n + 1 + n^2 + n + n^2 + n^3 + n^2 + n^3 + n^2 = 2n^3 + 4n^2 + 2n + 6
- Big O: 2n^3 + 4n^3 + 2n^3 + 6n^3 = 14(n^3); O(n^3)
- Omega: reduced to n^3; Omega(n^3)
- functions for Big O and Omega are equal; Theta(n^3)