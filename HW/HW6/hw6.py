from typing import List


class Solution():
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        nums.sort()
        triples = []
        for i in range(len(nums)):
            if nums[i] > 0:
                break
            if i > 0 and nums[i] == nums[i - 1]:
                continue
            lo = i + 1
            hi = len(nums) - 1
            while lo < hi:
                if nums[lo] + nums[hi] < -nums[i]:
                    lo += 1
                elif nums[lo] + nums[hi] > -nums[i]:
                    hi -= 1
                else:
                    triples.append([nums[i], nums[lo], nums[hi]])
                    oldL = nums[lo]
                    oldH = nums[hi]
                    while lo < hi and nums[lo] == oldL:
                        lo += 1
                    while lo < hi and nums[hi] == oldH:
                        hi -= 1
        return triples
    
#test case 1
print(Solution().threeSum([0, 1, 1]))
#test case 2
print(Solution().threeSum([-5, 0, 5, 10, -10, 0]))