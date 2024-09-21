class Solution:
    def minWindow(self, s: str, t: str) -> str:
        if len(t) > len(s):
            return ""
        # if len(t) == len(s) and s != t:
        #     return ""
        target = Counter(t)
        window = collections.defaultdict(int)
        need = len(set(t))
        have = 0
        low = 0
        high = 0
        result = None
        while high < len(s):
            letter = s[high]
            if letter in target:
                window[letter] += 1
                if target[letter] == window[letter]:
                    have += 1

            while have == need:
                if not result or high - low < len(result):
                    result = s[low : high + 1]
                letter = s[low]
                if letter in target:
                    window[letter] -= 1
                    if window[letter] < target[letter]:
                        have -= 1
                low += 1

            high += 1
        return result if result else ""
