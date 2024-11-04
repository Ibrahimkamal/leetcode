class Solution:
    def jump(self, nums: List[int]) -> int:
        n=len(nums)
        if n<=1:
            return 0
        current_max_jump=0
        next_max_jump=0
        jumps=0
        for i in range(0,n-1):
            next_max_jump=max(next_max_jump,i+nums[i])
            if i==current_max_jump:
                jumps+=1
                current_max_jump=next_max_jump
        return jumps