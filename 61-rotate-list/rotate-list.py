# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverse(self,head,start,end):
        pre_group=ListNode(-1,head)
        post_group=head
        index=0
        while post_group and index<end:
            if index<start:
                pre_group=pre_group.next
            post_group=post_group.next
            index+=1
        if (post_group):
            print(pre_group.val,post_group.val)
        else:
            print(pre_group.val,post_group)
        return head
            
    def rotateRight(self, head: Optional[ListNode], k: int) -> Optional[ListNode]:
        if not head:
            return
        length=0
        ptr=head
        ptr2=ptr.next
        dummy=ListNode(-1,head)
        while ptr:
            length+=1
            ptr=ptr.next
        k=k%length
        for i in range(k):
            ptr=dummy
            ptr2=ptr.next
            while ptr2.next:
                ptr=ptr.next
                ptr2=ptr2.next
            ptr.next=None
            ptr2.next=dummy.next
            dummy.next=ptr2
        # head=self.reverse(head,0,length)
        # head=self.reverse(head,0,k)
        # head=self.reverse(head,k,length)

        return dummy.next
        