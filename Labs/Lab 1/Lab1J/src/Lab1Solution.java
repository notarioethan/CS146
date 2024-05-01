import java.util.*;


public class Lab1Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hash = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++){
            int c = target - nums[i];
            if (hash.containsKey(c)) return new int[] {hash.get(c), i};
            hash.put(nums[i] , i);
        }
        return new int[] {};
    }
    public static void main(String[] args) throws Exception {
        Lab1Solution s = new Lab1Solution();
        //test 1 (from leetcode)
        System.out.println(Arrays.toString(s.twoSum(new int[] {2, 7, 11, 15}, 9)));
        //test 2 (from leetcode)
        System.out.println(Arrays.toString(s.twoSum(new int[] {3, 2, 4}, 6)));
        //test 3 (from leetcode)
        System.out.println(Arrays.toString(s.twoSum(new int[] {3, 3}, 6)));
    }
}
