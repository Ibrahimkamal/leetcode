class Solution:
    def hIndex(self, citations: List[int]) -> int:
        citations = sorted(citations)
        i = 0
        while i < len(citations) and citations[len(citations) - i - 1] > i:
            i += 1
        return i


# 0,1,3,5,6
# 1,2,3,4,5

# 1,1,3
# 1,2,3
