class Solution(object):
    def twoSum(self, nums, target):
        hash = {}
        for i in range(len(nums)):
            c = target - nums[i]
            if c in hash:
                return [hash[c], i]
            hash[nums[i]] = i

# 1
print(Solution().twoSum([2,7,11,15], 9))
# 2
print(Solution().twoSum([3,2,4], 6))
# 3
print(Solution().twoSum([3,3], 6))