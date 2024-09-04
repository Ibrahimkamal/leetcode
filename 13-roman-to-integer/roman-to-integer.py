class Solution:
    def romanToInt(self, s: str) -> int:
        values = {
            "I": 1,
            "V": 5,
            "X": 10,
            "L": 50,
            "C": 100,
            "D": 500,
            "M": 1000,
        }
        biggest = 0
        sum = 0
        for i in range(len(s) - 1, -1, -1):
            print(values[s[i]],biggest)
            if values[s[i]] < biggest:
                sum -= values[s[i]]
            else:
                sum += values[s[i]]
                biggest = values[s[i]]
        return sum
