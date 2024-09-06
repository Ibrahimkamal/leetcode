class Solution:
    def isPalindrome(self, s: str) -> bool:
        s_enhanced = ""
        for c in s:
            if c.isalnum():
                s_enhanced += c.lower()
        start = 0
        end = len(s_enhanced) - 1
        while start < end:
            if s_enhanced[start] != s_enhanced[end]:
                return False
            start += 1
            end -= 1
        return True
