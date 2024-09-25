class Solution:
    def insert(self, intervals: List[List[int]], newInterval: List[int]) -> List[List[int]]:
        inserted=False
        for i,interval in enumerate(intervals):
            start=interval[0]
            if(newInterval[0]<start):
                inserted=True
                intervals.insert(i, newInterval)
                break
        if not inserted:
            intervals.append(newInterval)
        result=[]
        index=0
        while index<len(intervals):
            start=intervals[index][0]
            end=intervals[index][1]
            while index<len(intervals) and intervals[index][0]<=end:
                end=max(end,intervals[index][1])
                index+=1
            result.append([start,end])

        return result