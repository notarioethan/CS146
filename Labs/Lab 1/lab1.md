# Lab 1

## Question:
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.

## Approach:
- create a hashmap to hold the elements of nums
- while iterating through nums:
    - every element has a number that it can add to to equal target (a complement); check if the hashmap contains it
        - if so, return an array that contains the indices of this element and its complement
    - add to the hash map with the element as the key and the index as the value
