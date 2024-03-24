Lab 5

Problem Statement: Given the root of a binary tree, determine if it is a valid binary search tree (BST).

Approach:
- use recursive helper function with lower and upper bounds as additional parameters to traverse through tree
- for each node, check 3 conditions:
    1. node's value is between min and max
    2. 1st condition is true for all nodes in left subtree
    3. 1st condition is true for all nodes in right subtree
- return true if all conditons met; else return false
