# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def mergeTwoLists(
        self, list1: Optional[ListNode], list2: Optional[ListNode]
    ) -> Optional[ListNode]:
        ptr1 = list1
        ptr2 = list2
        result = ListNode(-1)
        ptr3 = result
        while ptr1 or ptr2:
            if ptr1 and ptr2 and ptr1.val > ptr2.val:
                ptr3.next = ptr2
                ptr2 = ptr2.next
            elif ptr1 and ptr2 and ptr1.val <= ptr2.val:
                ptr3.next = ptr1
                ptr1 = ptr1.next
            elif ptr1:
                ptr3.next = ptr1
                ptr1 = ptr1.next
            elif ptr2:
                ptr3.next = ptr2
                ptr2 = ptr2.next
            else:
                print("Unhandled case")
            ptr3 = ptr3.next
        return result.next
