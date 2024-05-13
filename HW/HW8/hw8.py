class Solution():
    def longestPalindrome(self, s):
        letters = [0] * 52
        for acter in s:
            if ord(acter) < 97:
                letters[ord(acter) - 65] += 1
            else:
                letters[ord(acter) - 71] += 1
        pairs = 0
        unpaired = 0
        for count in letters:
            pairs += int(count / 2)
            unpaired += count % 2
        if unpaired > 0:
            unpaired = 1
        return unpaired + 2 * pairs
    
# test case 1
print(Solution().longestPalindrome("abccccdd"))
# test case 2
print(Solution().longestPalindrome("speediskey"))