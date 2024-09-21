class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        s_splitted = s.split(" ")
        if len(pattern) != len(s_splitted):
            return False
        map = {}
        assigned = set()
        for i, word in enumerate(s_splitted):
            if pattern[i] not in map and word not in assigned:
                map[pattern[i]] = word
                assigned.add(word)
            elif pattern[i] in map and map[pattern[i]]==word:
                continue
            else:
                return False
        return True
