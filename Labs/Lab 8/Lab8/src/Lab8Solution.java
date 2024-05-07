import java.util.*;

public class Lab8Solution {
    public int coinChange(int[] coins, int amount) {
        int[] mins = new int[amount + 1];
        Arrays.fill(mins, amount + 1);
        mins[0] = 0;

        for (int i = 0; i < coins.length; i++){
            for (int j = 0; j <= amount; j++){
                find(coins[i], j, mins);
            }
        }

        if (mins[amount] > amount) return -1;
        return mins[amount];
    }
    private void find(int cents, int amt, int[] mins){
        int quo = amt/cents;
        
        for (int i = quo; i >= 0; i--){
            mins[amt] = Math.min(mins[amt], i + mins[amt - cents * i]);
        }
    }
    public static void main(String[] args){
        Lab8Solution s = new Lab8Solution();
        //test case 1
        System.out.println(s.coinChange(new int[] {1, 2, 5}, 11));
        //test case 2
        System.out.println(s.coinChange(new int[] {2}, 3));
        //bonus test case
        System.out.println(s.coinChange(new int[] {186, 419, 83, 408}, 6249));
        //System.out.println(s.coinChange(new int[] {5, 1, 2}, 11));
    }
}
