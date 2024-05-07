from typing import List


class Solution(object):
    def coinChange(self, coins: List[int], amount: int) -> int:
        """
        :type coins: List[int]
        :type amount: int
        :rtype: int
        """
        mins = [amount + 1] * (amount + 1)
        mins[0] = 0
        for i in coins:
            for j in range(amount + 1):
                if j >= i:
                    mins[j] = min(mins[j], 1 + mins[j - i])
        if mins[amount] > amount:
            return -1
        return mins[amount]
    
#test case 1
print(Solution().coinChange([1,2,5], 11))
#test case 2
print(Solution().coinChange([2], 3))
#test case 3
print(Solution().coinChange([1], 0))