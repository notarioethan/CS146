# Lab 6

## Problem:
There are a total of numCourses courses you have to take, labeled from 0 to numCourses - 1. You are given an array prerequisites where prerequisites[i] = [ai, bi] indicates that you must take course bi first if you want to take course ai.

For example, the pair [0, 1], indicates that to take course 0 you have to first take course 1.

Return true if you can finish all courses. Otherwise, return false.

### Constraints:
- 1 <= numCourses <= 2000
- 0 <= prerequisites.length <= 5000
- prerequisites[i].length == 2
- 0 <= ai, bi < numCourses
- All the pairs prerequisites[i] are unique.

## Approach:
- you can finish all courses if the order is acyclic; you cannot if it is cyclic
- use topological sort - Kahn's algorithm
    - Kahn's algorithm only works properly on acyclic graphs
    1. create an edge list to hold every course that each course is a prerequisite for
    2. create an array of indegrees to hold the number of prerequisites required for each course
    3. create a list to hold every course that can be completed
    4. fill the edge list and the array of indegrees using the array of prerequisites
    5. perform Kahn's algorithm
    6. the number of courses that can be completed should be the same as the number of courses to take
        - if so, Kahn's algorithm worked properly, return true
        - if not, Kahn's algorithm did not work properly, return false