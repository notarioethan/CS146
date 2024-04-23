from typing import List


class Solution:
    def __init__(self):
        self.sources = []
    
    def minCostToSupplyWater(self, n: int, wells: List[int], pipes: List[List[int]]) -> int:
        sum = 0
        costs = pipes.copy()
        for i in range(n):
            costs.append([0, i + 1, wells[i]])
        self.sources = [0] * (n+1)
        for i in range (n+1):
            self.sources[i] = i
        for cost in costs:
            a = self.worm(cost[0])
            b = self.worm(cost[1])
            c = cost[2]
            if a != b:
                self.sources[a] = b
                sum += c
                n -= 1
                if n == 0:
                    return sum
        return sum

    
    def worm(self, x):
        if self.sources[x] != x:
            self.sources[x] = self.worm(self.sources[x])
        return self.sources[x]
    
    def sort(self, arr, bot , top):
        if bot < top:
            mid = (bot + top)/2
            self.sort(arr, bot, mid)
            self.sort(arr, mid + 1, top)
            self.merge(arr, bot, mid, top)
    
    def merge(self, arr, bot, mid, top):
        botLen = mid - bot + 1
        topLen = top - mid
        left = [None] * botLen
        right = [None] * topLen
        for i in range(botLen):
            left[i] = arr[bot + i]
        for i in range (topLen):
            right[i] = arr[mid + i + 1]
        i = 0
        j = 0
        k = bot
        while i < botLen and j < topLen:
            if left[i][2] <= right[j][2]:
                arr[k] = left[i]
                i += 1
            else:
                arr[k] = right[j]
                j += 1
            k += 1
        while i < botLen:
            arr[k] = left[i]
            i += 1
            k += 1
        while j < topLen:
            arr[k] = right[j]
            j += 1
            k += 1

#test case 1
wells = [1,1]
pipes = [[1,2,1],[1,2,2]]
print(Solution().minCostToSupplyWater(2, wells, pipes))
#bonus test
wells = [1,2,2]
pipes = [[1,2,1],[2,3,1]]
print(Solution().minCostToSupplyWater(3, wells, pipes))