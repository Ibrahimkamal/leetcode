class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        map=collections.defaultdict(list)
        for i,num in enumerate(nums):
            map[num].append(i)
        for i,num in enumerate(nums):
            complement=target-num
            if complement in map:
                for val in map[complement]:
                    if val!=i:
                        return [i,val]
                

        return [-1,-1]

