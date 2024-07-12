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
    public ListNode mergeNodes(ListNode head) {
        ListNode ptr1=head;
        ListNode ptr2=head.next;
        while(ptr2!=null)
        {
            int count=0;
            while(ptr2!=null && ptr2.val!=0){
                count+=ptr2.val;
                ptr2=ptr2.next;
            }
            
            ptr1.next=new ListNode(count,ptr2);
            ptr1=ptr1.next;
            ptr2=ptr2.next;
        }
        ptr1.next=null;
        return head.next;
    }
}