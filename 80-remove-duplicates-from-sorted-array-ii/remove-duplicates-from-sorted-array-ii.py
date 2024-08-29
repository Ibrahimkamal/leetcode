class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        insert_index = 1
        local_count = 1
        for i in range(1, len(nums)):
            prev = nums[i - 1]
            curr = nums[i]
            if prev == curr:
                local_count += 1
                if local_count <= 2:
                    nums[insert_index] = curr
                    insert_index += 1
            else:
                local_count = 1
                nums[insert_index] = curr
                insert_index += 1
        return insert_index
