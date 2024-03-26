import java.util.*;

public class HW10Solution {
    public static List<List<Integer>> levelOrder(TreeNode root){
        //if (root == null) return null;
        List<List<Integer>> levels = new ArrayList<List<Integer>>();//to be returned
        for (int i = 0; i < height(root); i++){
            List<Integer> level = new ArrayList<Integer>();
            addCurrentLevel(root, i, level);
            levels.add(level);
        }
        return levels;
    }
    private static int height(TreeNode node){
        if (node == null) return 0;
        if (height(node.left) > height(node. right)) return height(node.left) + 1;
        else return height(node.right) + 1;
    }
    private static void addCurrentLevel(TreeNode node, int lvl, List<Integer> list){
        if (node == null) return;
        if (lvl <= 0) list.add(node.val);
        else{
            addCurrentLevel(node.left, lvl - 1, list);
            addCurrentLevel(node.right, lvl - 1, list);
        }
    }
    public static void printListList(List<List<Integer>> listlist){
        if (listlist.size() == 0) System.out.println("None");
        for (int i = 0; i < listlist.size(); i++){
            List<Integer> list = listlist.get(i);
            
            for (int j = 0; j < list.size(); j++){
                System.out.print(list.get(j) + " ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args){
        TreeNode one = new TreeNode(1);
        TreeNode five = new TreeNode(5);
        TreeNode nine = new TreeNode(9);
        TreeNode three = new TreeNode(3, one, null);
        TreeNode eight = new TreeNode(8, five, nine);
        TreeNode four = new TreeNode(4, three, eight);
        //test case 1
        printListList(levelOrder(four));
        
        //test case 2
        printListList(levelOrder(null));
    }
}
