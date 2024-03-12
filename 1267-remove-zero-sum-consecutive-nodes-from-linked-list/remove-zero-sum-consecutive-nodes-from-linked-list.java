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
    public ListNode removeZeroSumSublists(ListNode head) {
        Map<Integer,ListNode> map=new HashMap<>();
        int accumulated_sum=0;
        ListNode preNode=new ListNode(0,head);
        ListNode ptr=preNode;
        while(ptr!=null){
            accumulated_sum+=ptr.val;
            map.put(accumulated_sum,ptr);
            ptr=ptr.next;
        }
        ptr=preNode;
        accumulated_sum=0;
        while(ptr!=null){
            accumulated_sum+=ptr.val;
            ptr.next=map.get(accumulated_sum).next;
            ptr=ptr.next;
        }
        return preNode.next;
    }
}