class Solution:
    def floodFill(self, image, sr, sc, color):
        #Your code here
        if (color == image[sr][sc]):
            return image
        m = len(image) - 1
        n = len(image[0]) - 1
        orig = image[sr][sc]
        queue = [(sr, sc)]
        while len(queue) > 0:
            coords = queue.pop(0)
            i = coords[0]
            j = coords[1]
            if i > 0 and image[i - 1][j] == orig:
                queue.append((i - 1, j))
            if i < m and image[i + 1][j] == orig:
                queue.append((i + 1, j))
            if j > 0 and image[i][j - 1] == orig:
                queue.append((i, j - 1))
            if j < n and image[i][j + 1] == orig:
                queue.append((i, j + 1))
            image[i][j] = color
        return image
    
# test case 1
t = [[1, 1, 1], [1, 1, 0], [1, 0, 1]]
print(t)
t = Solution().floodFill(t, 1, 1, 2)
print(t)
t = [[0, 0, 0], [0, 0, 0]]
print(t)
t = Solution().floodFill(t, 0, 0, 0)
print(t)