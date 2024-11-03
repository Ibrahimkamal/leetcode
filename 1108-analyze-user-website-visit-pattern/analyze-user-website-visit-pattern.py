from collections import defaultdict, Counter
from itertools import combinations


class Solution:
    def mostVisitedPattern(self, username, timestamp, website):
        # Step 1: Organize visits by user with timestamps sorted
        visits = defaultdict(list)
        for u, t, w in sorted(zip(username, timestamp, website)):
            visits[u].append(w)

        # Step 2: Generate all unique 3-sequence patterns per user
        patterns_count = Counter()
        for user, websites in visits.items():
            unique_patterns = set(combinations(websites, 3))
            for pattern in unique_patterns:
                patterns_count[pattern] += 1

        # Step 3: Find the most frequent pattern with lexicographical order in case of a tie
        max_score = max(patterns_count.values())
        max_patterns = [
            pattern for pattern, count in patterns_count.items() if count == max_score
        ]

        # Step 4: Select the lexicographically smallest pattern among those with max frequency
        return list(min(max_patterns))
