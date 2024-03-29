import java.util.*;

public class HW11Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        // Your code here
        if (color == image[sr][sc]) return image;
        int m = image.length - 1;
        int n = image[0].length - 1;
        Queue<int[]> toFill = new LinkedList<int[]>();
        toFill.offer(new int[] {sr, sc});
        int rep = image[sr][sc];
        while (!toFill.isEmpty()) {
            int[] node = toFill.poll();
            int i = node[0];
            int j = node[1];
            if (i > 0 && image[i - 1][j] == rep) toFill.offer(new int[] {i - 1, j});
            if (i < m && image[i + 1][j] == rep) toFill.offer(new int[] {i + 1, j});
            if (j > 0 && image[i][j - 1] == rep) toFill.offer(new int[] {i, j - 1});
            if (j < n && image[i][j + 1] == rep) toFill.offer(new int[] {i, j + 1});
            image[i][j] = color;
        }
        return image;
    }
    public static void printMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i ++){
            for (int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args){
        HW11Solution solve = new HW11Solution();
        //test case 1
        int[][] t = {{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};
        printMatrix(t);
        t = solve.floodFill(t, 1, 1, 2);
        printMatrix(t);
        //test case 2
        t = new int[][] {{0, 0, 0}, {0, 0, 0}};
        printMatrix(t);
        t = solve.floodFill(t, 0, 0, 0);
        printMatrix(t);
    }
}
