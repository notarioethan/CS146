public class TreeNode {

    int val;

    TreeNode left;

    TreeNode right;

    TreeNode() {}

    TreeNode(int val) { this.val = val; }

    TreeNode(int val, TreeNode left, TreeNode right) {

        this.val = val;

        this.left = left;

        this.right = right;

    }
    public static TreeNode invertTree(TreeNode root) {
    	inversion(root);
    	return root;
    }
    private static void inversion(TreeNode node) {
    	if (node == null) return;
    	TreeNode temp = node.right;
    	node.right = node.left;
    	node.left = temp;
        inversion(node.right);
    	inversion(node.left);
    }
    public static void printer(TreeNode node) {//in order traversal
    	printrecursive(node);
    	System.out.println();
    }
    private static void printrecursive(TreeNode node) {
    	if (node == null) return;
    	printrecursive(node.left);
    	System.out.print(node.val + " ");
    	printrecursive(node.right);
    }
    
    

 }

