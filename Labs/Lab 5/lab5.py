import sys

class TreeNode(object):

    def __init__(self, val=0, left=None, right=None):

        self.val = val

        self.left = left

        self.right = right

class Solution:

    def isValidBST(self, root):
        return self.validator(root, -sys.maxsize-1, sys.maxsize)

    def validator(self, node, min, max):
        if node == None:
            return True
        return node.val > min and node.val < max \
            and self.validator(node.left, min, node.val) and self.validator(node.right, node.val, max)
    
# test case 1
one_a = TreeNode(1)
five_a = TreeNode(5)
nine_a = TreeNode(9)
three_a = TreeNode(3, one_a, None)
eight_a = TreeNode(8, five_a, nine_a)
four_a = TreeNode(4, three_a, eight_a)
print(Solution().isValidBST(four_a))

# test case 2
three_b = TreeNode(3)
four_b = TreeNode(4)
five_b = TreeNode(5)
six_b = TreeNode(6)
two_b = TreeNode(2, three_b, four_b)
eight_b = TreeNode(8, five_b, six_b)
one_b = TreeNode(1, two_b, eight_b)
print(Solution().isValidBST(one_b))