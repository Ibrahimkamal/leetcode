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

    public ListNode removeNodes(ListNode head) {
       Stack<ListNode> stack=new Stack<>();
       ListNode current=head;
       while(current!=null){
        stack.push(current);
        current=current.next;
       }
       ListNode result=new ListNode(stack.pop().val);
       int current_max=result.val;
       while(!stack.isEmpty()){
        ListNode node=stack.pop();
        if(node.val<current_max) continue;
        node=new ListNode(node.val,result);
        result=node;
        current_max=result.val;
       }
       return result;
    }
}