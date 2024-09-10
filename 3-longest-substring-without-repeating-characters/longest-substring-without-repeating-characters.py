class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        
        found = set()
        index = 0
        result = 0
        for i in range(len(s)):
            if s[i] in found:
                while s[i] in found:
                    found.remove(s[index])
                    index += 1
            found.add(s[i])
            result = max(i - index + 1, result)
        return result if result > 0 else len(s)
