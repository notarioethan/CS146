public class TreeNode5 {

    int val;

    TreeNode5 left;

    TreeNode5 right;

    TreeNode5() {}

    TreeNode5(int val) { this.val = val; }

    TreeNode5(int val, TreeNode5 left, TreeNode5 right) {

        this.val = val;

        this.left = left;

        this.right = right;

    }
    public static boolean isValidBST(TreeNode5 root) {
        return validator(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    private static boolean validator(TreeNode5 node, int min, int max){
        if (node == null) return true;
        boolean a = validator(node.left, min, node.val);
        boolean b = validator(node.right, node.val, max);
        return a && b && min <= node.val && node.val <= max;
    }


 }
