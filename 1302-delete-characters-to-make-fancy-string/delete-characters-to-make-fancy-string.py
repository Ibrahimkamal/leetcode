class Solution:
    def makeFancyString(self, s: str) -> str:
        if len(s)<=2:
            return s
        result=s[:2]
        print(result)
        for i in range(2,len(s)):
            if s[i]==s[i-1] and s[i]==s[i-2]:
                continue
            result+=s[i]
        return result