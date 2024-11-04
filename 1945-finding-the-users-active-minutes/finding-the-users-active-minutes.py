class Solution:
    def findingUsersActiveMinutes(self, logs: List[List[int]], k: int) -> List[int]:
        max_time=logs[0][1]
        user_activity=collections.defaultdict(set)
        for log in logs:
            max_time=max(max_time,log[1])
            user_activity[log[0]].add(log[1])
        result=[0]*k
        print(user_activity)
        print (result)
        for values in user_activity.values():
            
            result[len(values)-1]+=1
        return result
        