class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        result = set()
        nums = sorted(nums)
        for i in range(len(nums) - 1):
            compliment = -nums[i]
            res = self.twoSum(nums[i + 1:], compliment, nums[i])
            if len(res)>0:
                for entry in res:
                    result.add(entry)
        return [list(val) for val in result]

    def twoSum(self, arr, goal, val):
        start, end = 0, len(arr) - 1
        result=[]
        while start < end:
            if arr[start] + arr[end] == goal:
                result.append((val, arr[start], arr[end]))
                start += 1
                end -= 1
            elif arr[start] + arr[end] > goal:
                end -= 1
            else:
                start += 1
        return result
