class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        longest=0
        num_set=set(nums)
        for num in nums:
            if num-1 not in num_set:
                current_streak=1
                current_num=num
                while current_num+1 in num_set:
                    current_num+=1
                    current_streak+=1
                longest=max(longest,current_streak)
        return longest