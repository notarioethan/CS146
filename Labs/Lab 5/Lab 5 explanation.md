# Lab 5

## Problem Statement: Given the root of a binary tree, determine if it is a valid binary search tree (BST).

### Approach:
- use recursive helper function with lower and upper bounds as additional parameters to traverse through tree
- for each node, check 3 conditions:
    1. node's value is between min and max
    2. 1st condition is true for all nodes in left subtree
    3. 1st condition is true for all nodes in right subtree
- return true if all conditons met; else return false

## Follow-up exercise: Can you think of a way to do this iteratively?
### Approach(not implemented):
- use a stack of nodes and a while loop for a long as the stack has nodes
- also have a stack of minimum values and a stack of maximum values that are assigned to the nodes
- while traversing tree, pop from all stacks and check the same conditions using those values; return false if not met
- push new nodes, mins, maxes to stacks if there are children
- return true (assumes no conditions failed during traversal)