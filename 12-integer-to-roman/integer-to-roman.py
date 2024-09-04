class Solution:
    def intToRoman(self, num: int) -> str:
        map = {
            1: "I",
            4: "IV",
            5: "V",
            9: "IX",
            10: "X",
            40: "XL",
            50: "L",
            90: "XC",
            100: "C",
            400: "CD",
            500: "D",
            900: "CM",
            1000: "M",
        }
        number = sorted(map.keys(), reverse=True)
        index = 0
        result = ""
        while num > 0:
            if num - number[index] >= 0:
                result += map[number[index]]
                num -= number[index]
            else:
                index += 1
        return result
