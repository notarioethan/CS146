class TreeNode(object):

     def __init__(self, val=0, left=None, right=None):

         self.val = val

         self.left = left

         self.right = right

class Solution:
    
    
    def invertTree(self, root):
        #Your code here
        if root == None:
            return
        temp = self.invertTree(root.left)
        root.left = self.invertTree(root.right)
        root.right = temp
        
        
        return root
    
    

    def printTree(self, node):
        if node == None:
            return
        self.printTree(node.left)
        print(node.val, end = ' ')
        self.printTree(node.right)
        

if __name__ == '__main__':
    #test case 1
    
    three = TreeNode(3)
    four = TreeNode(4)
    five = TreeNode(5)
    six = TreeNode(6)
    two = TreeNode(2, three, four)
    eight = TreeNode(8, five, six)
    one = TreeNode(1, two, eight)
    Solution().printTree(one)
    one = Solution().invertTree(one)
    print("\n")
    Solution().printTree(one)