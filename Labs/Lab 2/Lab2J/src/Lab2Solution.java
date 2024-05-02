import java.util.*;

public class Lab2Solution {
    public boolean isAnagram(String s, String t) {
        //counting sort
        int[] alpha1 = new int[26];
        int[] alpha2 = new int[26];
        for (int i = 0; i < s.length(); i++){
            int x = Character.toLowerCase(s.charAt(i)) - 'a';
            alpha1[x]++;
        }
        for (int i = 0; i < t.length(); i++){
            int x = Character.toLowerCase(t.charAt(i)) - 'a';
            alpha2[x]++;
        }
        return Arrays.equals(alpha1, alpha2);
    }
    public static void main(String[] args) throws Exception {
        Lab2Solution s = new Lab2Solution();
        //test cases from leetcode
        System.out.println(s.isAnagram("anagram", "nagaram"));
        System.out.println(s.isAnagram("rat", "car"));
    }
}
