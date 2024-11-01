class Solution:
    def minRefuelStops(
        self, target: int, startFuel: int, stations: List[List[int]]
    ) -> int:
        max_heap = []
        stations.append((target, float("inf")))
        fuel_stops = 0
        previous_location = 0
        for location, fuel in stations:
            startFuel -= location - previous_location
            while max_heap and startFuel < 0:
                startFuel += -heapq.heappop(max_heap)
                fuel_stops += 1
            if startFuel < 0:
                return -1
            heapq.heappush(max_heap, -fuel)
            previous_location = location
        return fuel_stops
