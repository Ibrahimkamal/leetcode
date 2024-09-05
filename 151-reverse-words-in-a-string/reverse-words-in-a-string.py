class Solution:
    def reverseWords(self, s: str) -> str:
        s = s.strip()
        while s.find("  ") >= 0:
            s = s.replace("  ", " ")
        reversed_list = s.split(" ")
        reversed_list.reverse()
        return " ".join(reversed_list)
