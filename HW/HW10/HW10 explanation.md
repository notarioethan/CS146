# HW 10

## Problem:
Given the root of a binary tree, return the level order traversal of its nodes' values. (i.e., from left to right, level by level).

Constraints:

The number of nodes in the tree is in the range [0, 2000].
-1000 <= TreeNode value <= 1000

### Approach:
- create a list of lists
- use a recursive helper method to determine the height of the tree
- using that value, use a for loop to traverse through every level of the tree
- use another helper method to add every node's value to a list on the given level
- after filling that list, add it to the list of lists
- return the list of lists