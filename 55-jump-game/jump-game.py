class Solution:
    def canJump(self, nums: List[int]) -> bool:
        length = len(nums)
        jump = nums[0]
        i = 0
        if length == 1:
            return True
        while i < length and jump > 0:
            if jump + i >= length:
                return True
            if nums[i] >= jump:
                jump = nums[i]
            else:
                jump -= 1
            i += 1

        return False
