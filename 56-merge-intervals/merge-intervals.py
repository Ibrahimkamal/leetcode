class Solution:
    def merge(self, intervals: List[List[int]]) -> List[List[int]]:
        intervals = sorted(intervals, key=lambda x: (x[0], x[1]))
        result=[]
        curr_start=intervals[0][0]
        curr_end=start=intervals[0][1]
        for i in range(1,len(intervals)):
            start=intervals[i][0]
            end=intervals[i][1]
            if start <= curr_end:
                if end>curr_end:
                    curr_end=end
            else:
                result.append([curr_start,curr_end])
                curr_start=start
                curr_end=end
        result.append([curr_start,curr_end])


        print(result)
        return result
