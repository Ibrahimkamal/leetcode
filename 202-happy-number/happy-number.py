class Solution:
    def isHappy(self, n: int) -> bool:
        def getNext(temp):
            result=0
            while temp>0:  
                result+=pow(temp%10,2)
                temp=temp//10
            return result
        slow=n
        fast=getNext(n)
        while(fast!=1 and slow!=fast):
            slow=getNext(slow)
            fast=getNext(getNext(fast))
        return fast==1
