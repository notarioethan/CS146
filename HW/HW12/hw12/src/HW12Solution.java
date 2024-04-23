import java.util.*;
public class HW12Solution {
    private int[] sources;

    public int minCostToSupplyWater(int n, int[] wells, int[][] pipes) {
        int sum = 0;
        int[][] costs = Arrays.copyOf(pipes, pipes.length + n);
        for (int i = 0; i < n; i++){
            costs[pipes.length + i] = new int[] {0, i + 1, wells[i]};//adds costs of wells
        }
        sort(costs, 0, costs.length - 1);
        
        sources = new int[n + 1];//index 0 is house's own well
        for (int i = 0; i <= n; i++){
            sources[i] = i;
        }
        for (int[] cost: costs){
            int a = cost[0], b = cost[1], c = cost[2];
            int houseA = worm(a), houseB = worm(b);
            if (houseA != houseB){
                sources[houseA] = houseB;
                sum += c;
                if (--n == 0) return sum;//--n bc one house satisfied, return when n == 0 bc completed
            }
        }
        return sum;//only necessary to make java happy, given constraints
    }
    private int worm(int x){//finds the root of each house's water
        if (sources[x] != x){
            sources[x] = worm(sources[x]);
        }
        return sources[x];
    }
    
    private static void merge(int[][] arr, int bot, int mid, int top){
        int botLen = mid - bot + 1;
        int topLen = top - mid;
        int[][] left = new int[botLen][3];
        for (int i = 0; i < botLen; i++){
            left[i] = arr[bot + i];
        }
        int[][] right = new int[topLen][3];
        for (int i = 0; i < topLen; i++){
            right[i] = arr[mid + 1 + i];
        }
        int i = 0, j = 0, k = bot;
        while (i < botLen && j < topLen){
            if(left[i][2] <= right[j][2]){
                arr[k] = left[i];
                i++;
            }
            else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < botLen){
            arr[k] = left[i];
            i++;
            k++;
        }
        while (j < topLen){
            arr[k] = right[j];
            j++;
            k++;
        }
    }
    private static void sort(int[][] arr, int bot, int top){
        if (bot < top){
            int mid = (bot + top)/2;
            sort(arr, bot, mid);
            sort(arr, mid + 1, top);
            merge(arr, bot, mid, top);
        }
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
        //bonur
        wells = new int[] {1,1,1,1,1};
        pipes = new int[][] {{1,2,10},{2,3,10}};
        System.out.println(s.minCostToSupplyWater(5, wells, pipes));//should be 5
    }
}
