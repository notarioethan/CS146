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