# Lab 8

## Question:
You are given an integer array coins representing coins of different denominations and an integer amount representing a total amount of money.

Return the fewest number of coins that you need to make up that amount. If that amount of money cannot be made up by any combination of the coins, return -1.

You may assume that you have an infinite number of each kind of coin.

### Constraints:
- 1 <= coins.length <= 12
- 1 <= coins[i] <= 231 - 1
- 0 <= amount <= 104

## Approach:
1. sort coins
    - assuming array unsorted
2. binary search for the largest coin less than or equal to amount
3. for that coin and all that are lower, use BFS to find the least number of coins needed to fulfill the given amount
    - for example: start at 25, amount -= 25, add this partial solution to a queue, then go to 10, amount -= 10, etc.
    - what the queue contains: [cents remaining, # of coins used]
4. repeat 2 and 3 until a solution is found, or until there is no possible solution.

or do knapsack-like algorithm (tabulation)