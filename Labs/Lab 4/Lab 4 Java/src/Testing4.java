public class Testing4 {
    public static void main(String[] args) {
		TreeNode4 six = new TreeNode4(6);
		TreeNode4 five = new TreeNode4(5);
		TreeNode4 three = new TreeNode4(3);
		TreeNode4 four = new TreeNode4(4);
		TreeNode4 eight = new TreeNode4(8, five, six);
		TreeNode4 two = new TreeNode4(2, three, four);
		TreeNode4 one = new TreeNode4(1, two, eight);
		TreeNode4.printer(one);
		one = TreeNode4.invertTree(one);
		
		TreeNode4.printer(one);
		one = TreeNode4.invertTree(one);
		TreeNode4.printer(one);
	}
}
