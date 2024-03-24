public class Testing4 {
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
	public static void main(String[] args) {
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
