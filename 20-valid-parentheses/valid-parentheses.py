class Solution:
    def isValid(self, s: str) -> bool:
        map = {"(": ")", "{": "}", "[": "]"}
        stack=[]
        for c in s:
            if c in map:
                stack.append(c)
            else:
                if len(stack)>0 and map[stack.pop()]==c:
                    continue
                else:
                    return False
        return len(stack)==0
