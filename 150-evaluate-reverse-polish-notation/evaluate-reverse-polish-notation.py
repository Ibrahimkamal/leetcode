class Solution:
    def evalRPN(self, tokens: List[str]) -> int:
        result=[]
        for token in tokens:
            if token=="+":
                right=result.pop()
                left=result.pop()
                result.append(left+right)
            elif token=="-":
                right=result.pop()
                left=result.pop()
                result.append(left-right)
            elif token=="*":
                right=result.pop()
                left=result.pop()
                result.append(left*right)
            elif token=="/":
                right=result.pop()
                left=result.pop()
                val=left/right
                if val>0:
                    val=floor(val)
                else:
                    val=ceil(val)
                result.append(val)
            else:
                result.append(int(token))
        return result[0]