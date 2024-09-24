class Solution:
    def containsNearbyDuplicate(self, nums: List[int], k: int) -> bool:
        map={}
        for i,num in enumerate(nums):
            if num in map and abs(map[num]-i)<=k:
                return True
            map[num]=i
        return False
                
        