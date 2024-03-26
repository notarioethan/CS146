# HW 9

## Problem:
    Given a binary search tree (BST), find the lowest common ancestor (LCA) node of two given nodes in the BST.

    The lowest common ancestor is defined between two nodes p and q as the lowest node in T that has both p and q as descendants (where we allow a node to be a descendant of itself).

    Constraints:

    The number of nodes in the tree is in the range [2, 105].
    -109 <= Node.val <= 109
    All values are unique.
    p != q
    p and q will exist in the BST.

### Approach
- use recursive function to traverse through tree
- return root if it is null (should not happen with given constraints)
- if p & q both less than the current node, check left subtree
- if both more than current node, check right subtree
- if neither, current node must be least common ancestor, return it

## Follow-up exercise: Can you think of a way to do this iteratively?

### Approach(not implemented):
- declare a TreeNode variable (curr) and point it to the root
    - like traversing a linked list
- use while loop that is active as long as curr isn't null
- if p & q both less than curr, point curr to its left child
- if both more than curr, point curr to its right child
- if neither, return curr