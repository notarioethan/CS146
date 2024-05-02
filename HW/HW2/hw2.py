class Solution(object):
    def __init__(self) -> None:
        self.bad = 0
    def setBad(self, x):
        self.bad = x
    def getBad(self):
        return self.bad
    def isBadVersion(self, x):
        if x >= self.bad:
            return True
        else:
            return False
    def firstBadVersion(self, n):
        
        a = 1
        b = n
        ans = 0
        while a <= b:
            mid = int((a + b)/2)
            if self.isBadVersion(mid):
                b = mid - 1
                ans = mid
            else:
                a = mid + 1
        return ans
    
s = Solution()
s.setBad(4)
print(s.firstBadVersion(5))
s.setBad(1)
print(s.firstBadVersion(1))
s.setBad(1702766719)
print(s.firstBadVersion(2126753390))