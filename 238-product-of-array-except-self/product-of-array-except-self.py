class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        left = nums[:]
        right = nums[:]

        for i in range(1, len(nums)):
            left[i] = left[i] * left[i - 1]
        for i in range(len(nums) - 2, -1, -1):
            right[i] = right[i] * right[i + 1]
        nums[0] = right[1]
        nums[len(nums) - 1] = left[len(nums) - 2]

        for i in range(1, len(nums) - 1):
            nums[i] = left[i - 1] * right[i + 1]
        return nums
