import java.util.*;

public class Lab8Solution {
    public int coinChange(int[] coins, int amount) {
        int[] mins = new int[amount + 1];
        Arrays.fill(mins, amount + 1);
        mins[0] = 0;

        for (int i = 0; i < coins.length; i++){
            for (int j = 0; j <= amount; j++){
                if (j >= coins[i]) mins[j] = Math.min(mins[j], 1 + mins[j - coins[i]]);
            }
        }
        if (mins[amount] > amount) return -1;
        return mins[amount];
    }
    public static void main(String[] args){
        Lab8Solution s = new Lab8Solution();
        //test case 1
        System.out.println(s.coinChange(new int[] {1, 2, 5}, 11));
        //test case 2
        System.out.println(s.coinChange(new int[] {2}, 3));
        //test case 3
        System.out.println(s.coinChange(new int[] {1}, 0));
        //bonus test cases
        System.out.println(s.coinChange(new int[] {186, 419, 83, 408}, 6249));
        System.out.println(s.coinChange(new int[] {5, 1, 2}, 11));
    }
}
