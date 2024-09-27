class Solution:
    def simplifyPath(self, path: str) -> str:
        stack=[]
        list=path.split("/")
        for item in list:
            if item=="" or item ==".":
                continue
            elif item=="..":
                if len(stack)>0:
                    stack.pop()
            
            else:
                stack.append(item)
        if len(stack)>0 and list[-1]=="/":
            pop()
        return "/"+"/".join(stack)

        