class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        map_t = {}
        map_s = {}
        for i in range(len(s)):
            map_t[t[i]] = ""
            map_s[s[i]] = ""

        for i in range(len(s)):
            if s[i] != t[i] and map_s[s[i]] == "" and map_t[t[i]] == "":
                map_s[s[i]] = t[i]
                map_t[t[i]] = t[i]
            elif s[i] != t[i] and map_s[s[i]] == t[i]:
                continue
            elif s[i] == t[i] and (
                (map_s[s[i]] == "" and map_t[t[i]] == "") or map_s[s[i]] == map_t[t[i]]
            ):
                map_s[s[i]] = t[i]
                map_t[t[i]] = t[i]
            else:
                return False
        return True
