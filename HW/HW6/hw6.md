# HW 6
## Problem statement:
Now that we're done discussing math-heavy stuff, here's another algorithmic problem! Here's the problem statement:

Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
### Constraints:
- The solution set must not contain duplicate triplets.
- The order of the output and the order of the triplets does not matter.
- 3 <= nums.length <= 3000
- -105 <= nums[i] <= 105
## Approach:
- sort the array in non-decreasing order
- create list to hold every triplet
- for every element in nums:
    - if positive, end the loop
    - if equal to the previous element, move on to the next element to avoid duplicates
    - otherwise, check all of the next elements for two numbers that can be added to this element to equal 0
        - create a low and high pointer, incrementing low if the sum of high and low is too low and decrementing high if the sum is too high - loops while low < high
        - if the sum is the wanted value, add these values as a triplet to the list
            - also increment low and decrement high if duplicates exist
- return the list