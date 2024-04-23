# HW12

## Problem:
There are n houses in a village. We want to supply water for all the houses by building wells and laying pipes.

For each house i, we can either build a well inside it directly with cost wells[i - 1] (note the -1 due to 0-indexing), or pipe in water from another well to it. The costs to lay pipes between houses are given by the array pipes where each pipes[j] = [house1j, house2j, costj] represents the cost to connect house1j and house2j together using a pipe. Connections are bidirectional, and there could be multiple valid connections between the same two houses with different costs.

Return the minimum total cost to supply water to all houses.

### Constraints:
- 2 <= n <= 104
- wells.length == n
- 0 <= wells[i] <= 105
- 1 <= pipes.length <= 104
- pipes[j].length == 3
- 1 <= house1j, house2j <= n
- 0 <= costj <= 105
- house1j != house2j

## Approach:
- perform an MST algorithm and return the sum of edge weights
    - Kruskal's algorithm
- create an int "sum" & initialize to 0
- take the info from wells and pipes to create a list of all edges
- sort the list in non-decreasing order with respect to the costs of each edge
    - merge sort for stability
- fill an array of size n + 1 to hold the furthest back ("root") house that each house connects to; call this "sources"
    - index 0 means a house's own well
    - all other indexes refer to other houses
    - starts with all indexes holding the value of the index
- while traversing through the list of edges
    - use a recursive helper function to find the ("root") of each house's water
    - if the roots are unequal
        - set the first house's root equal to the second house's root
        - add the cost of the edge to the sum
        - if all houses have water, return the sum
    - Kruskal's algorithm: add lowest available edge to solution unless both nodes are in the same tree

### Follow-up question:
Now that you've solved the problem with one approach, can you think of how to solve it using another approach?
- Use another MST algorithm such as Prim's algorithm.
    - Using wells and pipes, create an edge list that also contains weights
    - Prim's algorithm loop
        - starting from first house (marked as visited), visit destination of lowest unvisited edge of visited houses and mark as visited