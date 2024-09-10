class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        found = set()
        index = 0
        result = 0
        end = 0
        while end < (len(s)):
            if s[end] in found:
                while s[end] in found: 
                    found.remove(s[index])
                    index += 1
            else:
                found.add(s[end])
                end += 1
                result = max(end - index, result)
        return result if result > 0 else len(s)
