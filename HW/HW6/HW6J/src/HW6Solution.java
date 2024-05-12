import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HW6Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> triples = new ArrayList<List<Integer>>();
        for (int i = 0; i < nums.length; i++){
            if (nums[i] > 0) break;
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int lo = i + 1, hi = nums.length - 1;
            while (lo < hi){
                if (nums[lo] + nums[hi] < -nums[i]) lo++;
                else if (nums[lo] + nums[hi] > -nums[i]) hi--;
                else{
                    triples.add(Arrays.asList(nums[i], nums[lo], nums[hi]));
                    int oldL = nums[lo], oldH = nums[hi];
                    while (lo < hi && nums[lo] == oldL){
                        lo++;
                    }
                    while (lo < hi && nums[hi] == oldH){
                        hi--;
                    }
                }
            }
        }
        return triples;
    }
    public void printSequence(List<List<Integer>> seq){
        for (List<Integer> list: seq){
            System.out.println(list.toString());
        }
        System.out.println();
    }
    public static void main(String[] args) throws Exception {
        HW6Solution s = new HW6Solution();
        //test case 1
        s.printSequence(s.threeSum(new int[] {0, 1, 1}));
        //test case 2
        s.printSequence(s.threeSum(new int[] {-5, 0, 5, 10, -10, 0}));
    }
}
