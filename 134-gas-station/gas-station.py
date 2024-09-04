class Solution:
    def canCompleteCircuit(self, gas: List[int], cost: List[int]) -> int:
        total_count = 0
        current_count = 0
        index = 0
        for i in range(len(gas)):
            total_count += gas[i] - cost[i]
            current_count += gas[i] - cost[i]
            if current_count < 0:
                current_count = 0
                index = i + 1
        return index if total_count >= 0 else -1
