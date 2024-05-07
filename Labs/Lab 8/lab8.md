# Lab 8

## Question:
You are given an integer array coins representing coins of different denominations and an integer amount representing a total amount of money.

Return the fewest number of coins that you need to make up that amount. If that amount of money cannot be made up by any combination of the coins, return -1.

You may assume that you have an infinite number of each kind of coin.

### Constraints:
- 1 <= coins.length <= 12
- 1 <= coins[i] <= 2^31 - 1
- 0 <= amount <= 10^4

## Approach:
- basic idea: tabulation (like the knapsack problem)
1. create an array to hold the minimum number of coins needed
    - all indices initially hold the amount of money given + 1, except 0, which holds 0
2. for every coin value
    - for every number from 0 to the given amount of money, find the minimum number of coins needed to satisfy that amount
        - will help in finding minimum amounts for future coin values
3. if minimum number of coins is still greater than the amount of money, return -1, otherwise, return the minimum number of coins