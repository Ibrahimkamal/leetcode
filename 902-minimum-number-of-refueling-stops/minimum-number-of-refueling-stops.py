import heapq
from typing import List

class Solution:
    def minRefuelStops(self, target: int, startFuel: int, stations: List[List[int]]) -> int:
        """
        Calculate the minimum number of refueling stops needed to reach the target.
        """
        # Priority queue (max-heap) to store fuel capacities of stations we pass
        max_heap = []
        
        # Add the target as the last "station" to simplify logic
        stations.append((target, 10))
        
        # Initialize variables
        refuel_stops = 0  # Number of refueling stops made
        previous_location = 0  # Location of the previous station

        # Traverse each station, including the target
        for location, fuel in stations:
            # Reduce fuel by the distance traveled since the last station
            startFuel -= (location - previous_location)
            
            # Refuel as much as needed if we’re out of fuel before reaching this station
            while max_heap and startFuel < 0:
                # Pop the largest fuel from max-heap (stored as negative for max behavior)
                startFuel += -heapq.heappop(max_heap)
                refuel_stops += 1
            
            # If out of fuel and no refueling option is available, return -1
            if startFuel < 0:
                return -1
            
            # Push current station’s fuel capacity into max-heap for future stops
            heapq.heappush(max_heap, -fuel)
            
            # Update the previous location
            previous_location = location
        
        return refuel_stops
