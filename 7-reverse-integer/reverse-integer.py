class Solution:
    def reverse(self, x: int) -> int:
        """
        create a variable to store the result.
        create a loop while x is bigger than 0
        at each iteration divide compute y=mod x then divide by 10
        multiply result*10 then add y
        """
        result = 0
        is_negative = x < 0
        x = abs(x)
        while x > 0:
            y = mod(x, 10)
            x = int(x / 10)
            result *= 10
            result += y

            print(result)
        if result > pow(2, 31) - 1 or result < -pow(2, 31):
            return 0
        if is_negative:
            result *= -1
        return result
