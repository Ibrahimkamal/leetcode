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
    public ListNode doubleIt(ListNode head) {
        ListNode ptr=head;
        Stack<ListNode> s=new Stack<>();
        while(ptr!=null){
            s.add(ptr);
            ptr=ptr.next;
        }
        int carry=0;
        ListNode node=head;
        while(!s.isEmpty()){
            node=s.pop();
            int val=node.val*2+carry;
            if(val>9){
                val=val%10;
                carry=1;
            }else{
                carry=0;
            }
            node.val=val;
        }
        if(carry==1){
            head=new ListNode(1,node);
        }
        return head;
    }
}
// 6
// 6
// 3
// ----
// 366
// 732