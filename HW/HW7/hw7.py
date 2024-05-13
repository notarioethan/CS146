from typing import List


class Solution():
    def minMeetingRooms(self, intervals: List[List[int]]) -> int:
        starts = []
        ends = []
        for sched in intervals:
            starts.append(sched[0])
            ends.append(sched[1])
        starts.sort()
        ends.sort()
        i = 0
        j = 0
        active = 0
        max = 0
        while i < len(intervals) and j < len(intervals):
            if starts[i] < ends[j]:
                active += 1
                i += 1
            else:
                active -= 1
                j += 1
            if (active > max):
                max = active
        return max
    
#test case 1
print(Solution().minMeetingRooms([[0,30],[5,10],[15,20]]))
#test case 2
print(Solution().minMeetingRooms([[0,1],[1,2],[2,3]]))