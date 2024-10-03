# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def partition(self, head: Optional[ListNode], x: int) -> Optional[ListNode]:
        before=before_head=ListNode(0)
        after=after_head=ListNode(0)
        while head:
            if head.val<x:
                before.next=head
                before=before.next
            else:
                after.next=head
                after=after.next
            head=head.next
        after.next = None
        before.next=after_head.next
        return before_head.next

    # while ptr:
    #     if ptr.val < x:
    #         # Move the node to the position after `insert_node`
    #         pre.next = ptr.next
    #         ptr.next = insert_node.next
    #         insert_node.next = ptr
    #         insert_node = insert_node.next  # Update the insertion point
    #         ptr = pre.next  # Continue traversing from the next node
    #     else:
    #         pre = pre.next  # Update pre when ptr's value >= x
    #         ptr = ptr.next  # Move to the next node
        