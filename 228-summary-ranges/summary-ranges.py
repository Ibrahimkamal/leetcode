class Solution:
    def summaryRanges(self, nums: List[int]) -> List[str]:
        start = 0
        end = 0
        result = []
        for i in range(1, len(nums) + 1):
            if i < len(nums) and nums[i] == nums[i - 1] + 1:
                end = i
            else:
                if start == end:
                    result.append(f"{nums[start]}")
                else:
                    result.append(f"{nums[start]}->{nums[end]}")
                start = i
                end = i

        return result
