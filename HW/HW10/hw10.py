from typing import Optional
from typing import List

class TreeNode(object):

    def __init__(self, val=0, left=None, right=None):

        self.val = val

        self.left = left

        self.right = right

class Solution:

    def levelOrder(self, root: Optional[TreeNode]) -> List[List[int]]:
        listlist = []
        for i in range(self.height(root)):
            list = []
            self.addCurrentLevel(root, i, list)
            listlist.append(list)
        return listlist

        
    def height(self, node):
        if node == None:
            return 0
        if self.height(node.left) > self.height(node.right):
            return self.height(node.left) + 1
        else:
            return self.height(node.right) + 1
        
    def addCurrentLevel(self, node, lvl, list):
        if node == None:
            return
        if lvl <= 0:
            list.append(node.val)
        else:
            self.addCurrentLevel(node.left, lvl - 1, list)
            self.addCurrentLevel(node.right, lvl - 1, list)

one = TreeNode(1)
five = TreeNode(5)
nine = TreeNode(9)
three = TreeNode(3, one)
eight = TreeNode(8, five, nine)
four = TreeNode(4, three, eight)
# test case 1
print(Solution().levelOrder(four))
# test case 2
print(Solution().levelOrder(None))