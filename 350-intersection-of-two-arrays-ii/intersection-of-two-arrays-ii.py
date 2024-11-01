from collections import Counter
class Solution:
    def intersect(self, nums1: List[int], nums2: List[int]) -> List[int]:
        result=[]
        nums1=Counter(nums1)
        nums2=Counter(nums2)
        for num in nums2.keys():
            if num in nums1:
                multiplyer=min(nums1[num],nums2[num])
                result.extend([num]*multiplyer)
        return result
        