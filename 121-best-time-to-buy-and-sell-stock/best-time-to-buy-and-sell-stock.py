class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        local_min = prices[0]
        local_max = prices[0]
        profit = 0

        for price in prices:
            if price < local_min:
                local_min = price
                local_max = price
            elif price > local_max:
                local_max = price
            if local_max - local_min > profit:
                profit = local_max - local_min
        return profit
