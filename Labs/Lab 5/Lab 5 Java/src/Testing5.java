public class Testing5 {
    public static boolean isValidBST(TreeNode root) {
        return validator(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    private static boolean validator(TreeNode node, long min, long max){
        if (node == null) return true;
        return min < node.val && node.val < max && validator(node.left, min, node.val) && validator(node.right, node.val, max);
    }
    
    public static void main(String[] args) throws Exception {
        //test case 1
        TreeNode oneA = new TreeNode(1);
        TreeNode fiveA = new TreeNode(5);
        TreeNode nineA = new TreeNode(9);
        TreeNode threeA = new TreeNode(3, oneA, null);
        TreeNode eightA = new TreeNode(8, fiveA, nineA);
        TreeNode fourA = new TreeNode(4, threeA, eightA);
        System.out.println(isValidBST(fourA));
        //test case 2
        TreeNode threeB = new TreeNode(3);
        TreeNode fourB = new TreeNode(4);
        TreeNode fiveB = new TreeNode(5);
        TreeNode sixB = new TreeNode(6);
        TreeNode twoB = new TreeNode(2, threeB, fourB);
        TreeNode eightB = new TreeNode(8, fiveB, sixB);
        TreeNode oneB = new TreeNode(1, twoB, eightB);
        System.out.println(isValidBST(oneB));
    }
}
