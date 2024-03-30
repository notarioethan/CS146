# HW 11

## Problem Statement:
An image is represented by an m x n integer grid image where image[i][j] represents the pixel value of the image.

You are also given three integers sr, sc, and color. You should perform a flood fill on the image starting from the pixel image[sr][sc].

To perform a flood fill, consider the starting pixel, plus any pixels connected 4-directionally to the starting pixel of the same color as the starting pixel, plus any pixels connected 4-directionally to those pixels (also with the same color), and so on. Replace the color of all of the aforementioned pixels with color.

Return the modified image after performing the flood fill.

### Constraints:
- m == image.length
- n == image[i].length
- 1 <= m, n <= 50
- 0 <= image[i][j], color < 216
- 0 <= sr < m
- 0 <= sc < n

### Approach:
- basic idea: BFS
- save the color of the starting pixel (if it equals the new color, just return the image as-is)
- create a queue of pixel coordinates and add the starting pixel's coordinates
- while the queue is not empty:
    - remove a pixel's coordinates from the queue
    - check if each surrounding pixel shares the starting pixel's original color
        - if so, add those coordinates to the queue
    - change this pixel's color to the desired color
- return the image

## Follow-up Question:
Now that you've solved the problem with one approach, can you think of how to solve it using another approach? It should be fairly straightforward to do, once you've solved the question once. 

### Approach(not implemented):
- instead of a while loop, use a recursive helper function 
    - add # of rows, # of columns, color as additional parameters
    - otherwise the same function as the while loop