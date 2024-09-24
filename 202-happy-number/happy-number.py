class Solution:
    def isHappy(self, n: int) -> bool:
        map={}
        while True:
            if n==1:
                    return True
            temp=n
            current=n
            n=0
            while temp>0:  
                n+=pow(temp%10,2)
                temp=temp//10
            if n in map:
                return False
            map[current]=n
        return False
