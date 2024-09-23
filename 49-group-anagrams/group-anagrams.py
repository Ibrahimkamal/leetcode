class Solution:
    def sortString(self,s):
        l=sorted(list(s))
        return "".join(l)
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        map=collections.defaultdict(list)
        for str in strs:
            map[self.sortString(str)].append(str)
        return [x for x in map.values()]