class Solution(object):
    def findOrder(self, numCourses, prerequisites):
        """
        :type numCourses: int
        :type prerequisites: List[List[int]]
        :rtype: List[int]
        """
        edges = [None] * numCourses#holds lists
        indegrees = [0] * numCourses
        good = []
        #b -> a
        for arr in prerequisites:
            a = arr[0]
            b = arr[1]
            if edges[b] == None:
                edges[b] = []
            edges[b].append(a)
            indegrees[a] += 1
        queue = []
        for i in range(len(indegrees)):
            if indegrees[i] == 0:
                queue.append(i)
        while len(queue) > 0:
            c = queue.pop(0)
            if edges[c] != None:
                for j in edges[c]:
                    indegrees[j] -= 1
                    if indegrees[j] == 0:
                        queue.append(j)
            good.append(c)
        if (len(good) < numCourses):
            return []
        return good
    
print(Solution().findOrder(3, [[2,1],[1,0]]))