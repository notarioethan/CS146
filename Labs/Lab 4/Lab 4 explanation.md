#Lab 4

##Problem Statement: Given the root of a binary tree, invert the tree, and return its root.

###Approach:
- use recursive helper function to traverse through binary tree (no helper method for Python)
- for every node, swap left and right pointers
- return root

##Follow-up exercise: Can you think of a way to do this iteratively?
###Approach(not implemented):
- create a stack containing the root
- use while loop (while stack not empty)
- pop a node off the stack, swap left and right pointers
- push left and right children onto the stack if they exist