class Solution:
    def rotateOnce(self, nums):
        last = nums[len(nums) - 1]
        for i in range(len(nums)-2, -1,-1):
            nums[i + 1] = nums[i]
        nums[0] = last

    def rotate(self, nums: List[int], k: int) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        for i in range(k):
            nums.insert(0, nums.pop())
