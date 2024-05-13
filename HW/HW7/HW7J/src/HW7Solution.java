import java.util.*;

public class HW7Solution {
    public int minMeetingRooms(int[][] intervals) {//1 <= n <= 10^4
          int n = intervals.length;
          int[] starts = new int[n];
          int[] ends = new int[n];
          for (int i = 0; i < n; i++){
            starts[i] = intervals[i][0];
            ends[i] = intervals[i][1];
          }
          Arrays.sort(starts);
          Arrays.sort(ends);
          int j = 0, k = 0, active = 0, max = 0;
          while (j < n && k < n){
            if (starts[j] < ends[k]){
                active++;
                j++;
            }
            else{
                active--;
                k++;
            }
            if (active > max) max = active;
          }
          return max;
    }
    public static void main(String[] args) throws Exception {
        HW7Solution s = new HW7Solution();
        //test case 1
        System.out.println(s.minMeetingRooms(new int[][] {{0,30},{5,10},{15,20}}));
        //test case 2
        System.out.println(s.minMeetingRooms(new int[][] {{0,1},{1,2},{2,3}}));
    }
}
