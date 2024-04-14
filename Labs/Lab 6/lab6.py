class Solution:
    def canFinish(self, numCourses, prerequisites): #I added self to the method header
        if len(prerequisites) == 0:
            return True
        edges = [None] * numCourses #holds courses that each course is prereq for; array of list of ints
        indegrees = [0] * numCourses #holds # of indegrees for each course; array of ints
        satisfied = [] #holds satisfied courses; list of ints

        for pair in prerequisites:
            course = pair[0]
            prereq = pair[1]
            if edges[prereq] == None:
                edges[prereq] = []
            edges[prereq].append(course)
            indegrees[course] += 1

        queue = []
        for i in range(numCourses):
            if indegrees[i] == 0:
                queue.append(i)
        while len(queue) != 0:
            curr = queue.pop(0)
            satisfied.append(curr)
            if edges[curr] != None:
                for next in edges[curr]:
                    indegrees[next] -= 1
                    if indegrees[next] == 0:
                        queue.append(next)
        return len(satisfied) == numCourses
    
#test case 1
test = [[1,0]]
print(Solution().canFinish(2, test))
test = [[1,0],[0,1]]
print(Solution().canFinish(2, test))