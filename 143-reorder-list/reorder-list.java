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
           next=first.next;
           first.next=second;
           first=next;
        
            next=second.next;
           second.next=first;
           second=next;

        }
    }
}