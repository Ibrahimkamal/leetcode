class Solution:
    def mostVisitedPattern(
        self, username: List[str], timestamp: List[int], website: List[str]
    ) -> List[str]:
        user_activity = collections.defaultdict(list)
        for u, t, w in sorted(zip(username, timestamp, website)):
            user_activity[u].append(w)
        patterns_count = Counter()
        for visits in user_activity.values():
            patterns = set(combinations(visits, 3))
            for pattern in patterns:
                patterns_count[pattern] += 1
        max_repetition = max(patterns_count.values())
        results = []
        [
            results.append(r)
            for r in patterns_count.keys()
            if patterns_count[r] == max_repetition
        ]
        return sorted(results)[0]
