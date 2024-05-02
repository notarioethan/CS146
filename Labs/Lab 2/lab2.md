# Lab 2

## Question:
Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

### Approach:
- use auxiliary arrays of size 26 to count the number of occurences of each letter in each string (like in counting sort)
    - capital letters are treated as equal to their lowercase counterparts in my implementation
- if the arrays are equal, the strings are anagrams; if not, they are not