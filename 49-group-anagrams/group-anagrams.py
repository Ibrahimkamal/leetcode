from collections import defaultdict
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        anagrams_map=defaultdict(list)
        for word in strs:
            anagrams_map["".join(sorted(word))].append(word)
        print (anagrams_map)
        return [val for val in anagrams_map.values()]
        