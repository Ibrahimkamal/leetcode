from typing import List
import collections

class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        # Using a dictionary to keep track of indices
        num_map = {}
        
        for i, num in enumerate(nums):
            complement = target - num
            if complement in num_map:
                return [num_map[complement], i]
            num_map[num] = i
        
        return [-1, -1]


