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
    public ListNode middleNode(ListNode head) {
        if(head==null)
            return head;
        ListNode ptr=head;
        ListNode fast_ptr=head;
        while(fast_ptr!=null && fast_ptr.next!=null){
            ptr=ptr.next;
            fast_ptr=fast_ptr.next.next;
        }
        return ptr;
    }
}