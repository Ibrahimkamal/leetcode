class Solution:
    def trap(self, height: List[int]) -> int:
        ans = 0
        size = len(height)
        if size == 0:
            return ans
        left_cache, right_cache = [0] * size, [0] * size
        left_cache[0] = height[0]
        for i in range(1, size):
            left_cache[i] = max(left_cache[i - 1], height[i])

        right_cache[size - 1] = height[size - 1]
        for i in range(size - 2, -1, -1):
            right_cache[i] = max(right_cache[i + 1], height[i])

        for i in range(1, size - 1):
            ans += min(right_cache[i], left_cache[i]) - height[i]
        return ans


# [0,1,0,2,1,0,1,3,2,1,2,1]
