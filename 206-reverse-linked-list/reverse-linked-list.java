/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode ptr=head;
        ListNode prev=null;
        if(ptr==null){
            return head;
        }
        ListNode ptr_next=ptr.next;

        while(ptr_next!=null){
            ptr.next=prev;
            prev=ptr;
            ptr=ptr_next;
            ptr_next=ptr_next.next;
        }
        ptr.next=prev;
        return ptr;

    }
}