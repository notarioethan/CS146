public class HW8Solution {
    public int longestPalindrome(String s) {
        int[] letters = new int[52];
        for (int i = 0; i < s.length(); i++){
            char acter = s.charAt(i);
            if (acter < 'a') letters[acter - 'A']++;
            else letters[acter - 'G']++;
        }
        int pairs = 0;
        int unpaired = 0;//determines whether to add 1 or not
        for (int count: letters){
            pairs += count / 2;
            unpaired += count % 2;
        }
        if (unpaired > 0) unpaired = 1;
        return unpaired + 2 * pairs;
    }
    public static void main(String[] args) throws Exception {
        HW8Solution s = new HW8Solution();
        //test case 1
        System.out.println(s.longestPalindrome("abccccdd"));
        //test case 2
        System.out.println(s.longestPalindrome("speediskey"));
    }
}
