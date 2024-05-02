class Solution:
    def isAnagram(self, s, t):
        alpha = [0] * 26
        beta = [0] * 26
        for ch in s:
            alpha[ord(ch.lower()) - 97] += 1
        for ch in t:
            beta[ord(ch.lower()) - 97] += 1
        return alpha == beta
# test cases from leetcode
print(Solution().isAnagram("anagram", "nagaram"))
print(Solution().isAnagram("rat", "car"))