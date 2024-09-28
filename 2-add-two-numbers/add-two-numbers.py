# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def addTwoNumbers(
        self, l1: Optional[ListNode], l2: Optional[ListNode]
    ) -> Optional[ListNode]:
        ptr1 = l1
        ptr2 = l2
        carry = 0
        result = ListNode(-1)
        ptr3 = result
        while ptr1 and ptr2:
            sum = ptr1.val + ptr2.val + carry
            val = sum % 10
            carry = sum // 10
            ptr1 = ptr1.next
            ptr2 = ptr2.next
            ptr3.next = ListNode(val)
            ptr3 = ptr3.next

        while ptr1:
            sum = ptr1.val + carry
            val = sum % 10
            carry = sum // 10
            ptr1 = ptr1.next
            ptr3.next = ListNode(val)
            ptr3 = ptr3.next
        while ptr2:
            sum = ptr2.val + carry
            val = sum % 10
            carry = sum // 10
            ptr2 = ptr2.next
            ptr3.next = ListNode(val)
            ptr3 = ptr3.next
        if carry==1:
            ptr3.next = ListNode(1)
        return result.next
