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
  
    public boolean isPalindrome(ListNode head) {
        int size=0;
        ListNode ptr=head;
        while(ptr!=null){
            ptr=ptr.next;
            size+=1;
        }
        int count=0;
        ptr=head;
        ListNode pre_ptr=new ListNode(-1);
        ListNode next_ptr=ptr.next;

        while(ptr!=null){
            if(count>=Math.ceil(size/2)){
                ptr.next=pre_ptr;
                pre_ptr=ptr;
                ptr=next_ptr;
                if(ptr!=null){
                    next_ptr=ptr.next;
                }
            }else{
                ptr=ptr.next;
                next_ptr=ptr.next;
            }
            count++;
            
        }
        ptr=head;
        count=0;
        while(count<Math.floor(size/2)){
            if(ptr.val!=pre_ptr.val){
                return false;
            }
            ptr=ptr.next;
            pre_ptr=pre_ptr.next;
            count++;
            
        }
        return true;
    }
}