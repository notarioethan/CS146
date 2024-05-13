# HW 8

## Problem statement:
Given a string s which consists of lowercase or uppercase letters, return the length of the longest palindrome that can be built with those letters.

Letters are case sensitive, for example, "Aa" is not considered a palindrome here.
### Constraints:
- 1 <= s.length <= 2000
- s consists of lowercase and/or uppercase English letters only.

## Approach:
- create an array of length 52, with each index representing an uppercase or lowercase English letter
- traverse through avery character in the string and update the count of each letter
- using the array of counts, find the number of pairs of letters
- the answer is double that number, and if the number of unpaired letters > 0, add 1 to the answer