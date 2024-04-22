import java.util.*;
public class HW12Solution {
    public int minCostToSupplyWater(int n, int[] wells, int[][] pipes) {
        int sum = 0;
        int[][] costs = Arrays.copyOf(pipes, pipes.length + n);
        for (int i = 0; i < n; i++){
            costs[pipes.length + i] = new int[] {0, i + 1, wells[i]};//adds costs of wells
        }

        return sum;
    }
    private void mergeSort(int[][] matrix){
        
    }
    public static void main(String[] args)  {
        HW12Solution s = new HW12Solution();
        //test case 1
        int[] wells = {1,1};
        int[][] pipes = {{1,2,1},{1,2,2}};
        System.out.println(s.minCostToSupplyWater(2, wells, pipes));//should be 2
        //bonus test
        wells = new int[] {1,2,2};
        pipes = new int[][] {{1,2,1},{2,3,1}};
        System.out.println(s.minCostToSupplyWater(3, wells, pipes));//should be 3
    }
}
