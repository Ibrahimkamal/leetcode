"""
# Definition for a Node.
class Node:
    def __init__(self, x: int, next: 'Node' = None, random: 'Node' = None):
        self.val = int(x)
        self.next = next
        self.random = random
"""

class Solution:
    def copyRandomList(self, head: 'Optional[Node]') -> 'Optional[Node]':
        map={}
        result=ListNode(-1)
        ptr1=head
        ptr2=result
        while ptr1:
            if ptr1 in map:
                new_node=map[ptr1]
            else:
                new_node=Node(ptr1.val)
                map[ptr1]=new_node
            if ptr1.random:
                if ptr1.random in map:
                    new_node.random=map[ptr1.random]
                else:

                    randomNode=Node(ptr1.random.val)
                    map[ptr1.random]=randomNode
                    new_node.random=randomNode

            ptr1=ptr1.next
            ptr2.next=new_node
            ptr2=ptr2.next
        return result.next
            