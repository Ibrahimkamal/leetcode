# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def recursive(self, node, n):
        if not node:
            return 1
        result = self.recursive(node.next,n)
        if result == n+1:
            node.next = node.next.next
        return result + 1

    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        if not head or head.next==None:
            return None
        head=ListNode(-1,head)
        self.recursive(head, n)
        return head.next
