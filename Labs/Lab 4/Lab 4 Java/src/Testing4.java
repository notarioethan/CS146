public class Testing4 {
    public static TreeNode invertTree(TreeNode root) {
    	//inversion(root);
		if (root == null) return root;
		root.left = invertTree(root.right);
		root.right = invertTree(root.left);
    	return root;
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
	public static void main(String[] args) {
		//test case 1
		TreeNode six = new TreeNode(6);
		TreeNode five = new TreeNode(5);
		TreeNode three = new TreeNode(3);
		TreeNode four = new TreeNode(4);
		TreeNode eight = new TreeNode(8, five, six);
		TreeNode two = new TreeNode(2, three, four);
		TreeNode one = new TreeNode(1, two, eight);
		printer(one);
		one = invertTree(one);
		
		printer(one);
		one = invertTree(one);
		printer(one);
	}
}
