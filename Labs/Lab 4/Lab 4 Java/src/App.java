public class App {
    public static void main(String[] args) {
		TreeNode six = new TreeNode(6);
		TreeNode five = new TreeNode(5);
		TreeNode three = new TreeNode(3);
		TreeNode four = new TreeNode(4);
		TreeNode eight = new TreeNode(8, five, six);
		TreeNode two = new TreeNode(2, three, four);
		TreeNode one = new TreeNode(1, two, eight);
		TreeNode.printer(one);
		one = TreeNode.invertTree(one);
		
		TreeNode.printer(one);
		one = TreeNode.invertTree(one);
		TreeNode.printer(one);
	}
}
