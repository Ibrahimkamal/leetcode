class Solution:
    def canConstruct(self, ransomNote: str, magazine: str) -> bool:
        dict = collections.defaultdict(int)
        for c in magazine:
            dict[c] += 1
        for c in ransomNote:
            if c not in dict or dict[c] == 0:
                return False
            else:
                dict[c] -= 1
        return True
