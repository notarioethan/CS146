public class HW2Solution {
    private int bad;
    public void setBad(int x){
        bad = x;
    }
    public int getBad(){
        return bad;
    }
    private boolean isBadVersion(int x){//just for testing
        if (x >= bad) return true;
        else return false;
    }
    public int firstBadVersion(int n) {
        //binary search
        long a = 1, b = n;
        int ans = 0;
        while (a <= b){
            int mid = (int)((a + b)/2);
            if (isBadVersion(mid)){
                b = mid - 1;
                ans = mid;
            } else{
                a = mid + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) throws Exception {
        HW2Solution s = new HW2Solution();
        //I don't know how to properly test this here but it works on LeetCode.
        s.setBad(4);
        System.out.println(s.firstBadVersion(5));
        s.setBad(1);
        System.out.println(s.firstBadVersion(1));
        s.setBad(1702766719);
        System.out.println(s.firstBadVersion(2126753390));
    }
}
