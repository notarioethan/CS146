public class Testing5 {
    public static void main(String[] args) throws Exception {
        //test case 1
        TreeNode5 oneA = new TreeNode5(1);
        TreeNode5 fiveA = new TreeNode5(5);
        TreeNode5 nineA = new TreeNode5(9);
        TreeNode5 threeA = new TreeNode5(3, oneA, null);
        TreeNode5 eightA = new TreeNode5(8, fiveA, nineA);
        TreeNode5 fourA = new TreeNode5(4, threeA, eightA);
        System.out.println(TreeNode5.isValidBST(fourA));
        //test case 2
        TreeNode5 threeB = new TreeNode5(3);
        TreeNode5 fourB = new TreeNode5(4);
        TreeNode5 fiveB = new TreeNode5(5);
        TreeNode5 sixB = new TreeNode5(6);
        TreeNode5 twoB = new TreeNode5(2, threeB, fourB);
        TreeNode5 eightB = new TreeNode5(8, fiveB, sixB);
        TreeNode5 oneB = new TreeNode5(1, twoB, eightB);
        System.out.println(TreeNode5.isValidBST(oneB));
    }
}
