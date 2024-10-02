# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def deleteDuplicates(self, head: Optional[ListNode]) -> Optional[ListNode]:
        head=ListNode(-1,head)
        pre=head
        ptr=head.next
        while ptr:
            ptr2=ptr.next
            deleted=False
            while ptr2 and ptr2.val==ptr.val:
                ptr2=ptr2.next
                deleted=True
            if deleted:
              pre.next=ptr2
            else:
                pre=ptr
            ptr=pre.next
        return head.next
