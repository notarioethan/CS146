public class TreeNode4 {

    int val;

    TreeNode4 left;

    TreeNode4 right;

    TreeNode4() {}

    TreeNode4(int val) { this.val = val; }

    TreeNode4(int val, TreeNode4 left, TreeNode4 right) {

        this.val = val;

        this.left = left;

        this.right = right;

    }
    public static TreeNode4 invertTree(TreeNode4 root) {
    	inversion(root);
    	return root;
    }
    private static void inversion(TreeNode4 node) {
    	if (node == null) return;
    	TreeNode4 temp = node.right;
    	node.right = node.left;
    	node.left = temp;
        inversion(node.right);
    	inversion(node.left);
    }
    public static void printer(TreeNode4 node) {//in order traversal
    	printrecursive(node);
    	System.out.println();
    }
    private static void printrecursive(TreeNode4 node) {
    	if (node == null) return;
    	printrecursive(node.left);
    	System.out.print(node.val + " ");
    	printrecursive(node.right);
    }
    
    

 }

