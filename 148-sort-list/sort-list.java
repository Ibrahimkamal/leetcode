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
    public ListNode sortList(ListNode head) {
        ArrayList<ListNode> list=new ArrayList<>();
        ListNode ptr=head;
        while(ptr!=null){
            list.add(ptr);
            ptr=ptr.next;
        }
        Collections.sort(list,new Comparator<ListNode>() {
            public int compare(ListNode a, ListNode b){
                return Integer.compare(a.val, b.val);
            }
        });
        ListNode dummy=new ListNode(0);
        ptr=dummy;
        for(int i=0;i<list.size();i++)
        {
            ptr.next=list.get(i);
            ptr=ptr.next;
        }
        ptr.next=null;
        return dummy.next;
    }
}