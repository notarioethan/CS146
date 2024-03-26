class TreeNode(object):

    def __init__(self, val=0, left=None, right=None):

        self.val = val

        self.left = left

        self.right = right

class Solution:

    def lowestCommonAncestor(self, root: 'TreeNode', p: 'TreeNode', q: 'TreeNode') -> 'TreeNode':
        if root == None:
            return
        if p.val < root.val and q.val < root.val:
            return self.lowestCommonAncestor(root.left, p, q)
        elif p.val > root.val and q.val > root.val:
            return self.lowestCommonAncestor(root.right, p, q)
        else:
            return root
        
one = TreeNode(1)
five = TreeNode(5)
nine = TreeNode(9)
three = TreeNode(3, one)
eight = TreeNode(8, five, nine)
four = TreeNode(4, three, eight)
# test case 1
print(Solution().lowestCommonAncestor(four, three, one).val)
# test case 2
print(Solution().lowestCommonAncestor(four, one, five).val)
