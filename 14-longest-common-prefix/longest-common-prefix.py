class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        result = strs[0]
        for i in range(1, len(strs)):
            while strs[i].find(result) != 0:
                result = result[: len(result)-1]
                if result == "":
                    return ""
        return result
