class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        insert_index = 1
        index = 1
        repetition = 1
        while index < len(nums):
            if nums[index] == nums[index - 1]:
                repetition += 1
            else:
                repetition = 1

            if repetition <= 2:
                nums[insert_index] = nums[index]
                insert_index += 1
            index += 1
        return insert_index
