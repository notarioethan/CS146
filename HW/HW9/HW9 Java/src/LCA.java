public class LCA {
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        //your code here
        if (root == null) return root;
        if (p.val < root.val && q.val < root.val) return lowestCommonAncestor(root.left, p, q);
        else if (p.val > root.val && q.val > root.val) return lowestCommonAncestor(root.right, p, q);
        else return root;
 
    }
    public static void printNode(TreeNode node){
        System.out.println(node.val);
    }
     
    public static void main(String[] args){
        TreeNode one = new TreeNode(1);
        TreeNode five = new TreeNode(5);
        TreeNode nine = new TreeNode(9);
        TreeNode three = new TreeNode(3, one, null);
        TreeNode eight = new TreeNode(8, five, nine);
        TreeNode four = new TreeNode(4, three, eight);
        //test case 1
        printNode(lowestCommonAncestor(four, three, one));
        //test case 2
        printNode(lowestCommonAncestor(four, one, five));
    }
}
