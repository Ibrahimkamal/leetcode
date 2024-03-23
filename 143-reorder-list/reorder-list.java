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
    public void reorderList(ListNode head) {
        int size=0;
        ListNode ptr=head;
        while(ptr!=null){
            ptr=ptr.next;
            size++;
        }
        ptr=head;
        ListNode previous=null;
        ListNode next=null;
        int count=0;
        while(ptr!=null){
            if(count>=Math.ceil(size/2)){
                next=ptr.next;
                ptr.next=previous;
                previous=ptr;
                ptr=next;
            }else{
                ptr=ptr.next;
            }
            count++;
        }
        ListNode first = head;
        ListNode second = previous;
        while (second.next != null) {
            next = first.next; // Store next node of the first part
            first.next = second; // Connect current node of the first part to the current node of the second part
            first = next; // Move the first pointer to the next node (stored before)

            next = second.next; // Store next node of the second part
            second.next = first; // Connect current node of the second part to the next node of the first part (before moving)
            second = next; // Move the second pointer to the next node (stored before)
        }
    }
}