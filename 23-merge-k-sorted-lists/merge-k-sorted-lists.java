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
    private ListNode merge(ListNode node1, ListNode node2){
        ListNode result=new ListNode(-1);
        ListNode ptr=result;
        while(node1!=null && node2!=null){
            if(node1.val<node2.val){
                ptr.next=node1;
                node1=node1.next;
            }else{
                ptr.next=node2;
                node2=node2.next;
            }
            ptr=ptr.next;
        }
        if(node1!=null){
            ptr.next=node1;
        }else{
            ptr.next=node2;
        }
        return result.next;
    }
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0)
            return null;
        ListNode result=null;
        for(ListNode list:lists){
            if(lists==null){
                continue;
            }
            result=merge(result,list);
        }
        return result;
    }
}