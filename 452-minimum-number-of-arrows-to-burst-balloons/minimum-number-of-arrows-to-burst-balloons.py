class Solution:
    def findMinArrowShots(self, points: List[List[int]]) -> int:
        points=sorted(points)
        index=0
        result=0
        left=0
        right=0
        while left<len(points) and right<len(points):
            end=points[left][1]
            while left<len(points) and points[left][0]<=end:
                end=min(end,points[left][1])
                left+=1
            result+=1
        return result

# [[9,12],[1,10],[4,11],[8,12],[3,9],[6,9],[6,7]]