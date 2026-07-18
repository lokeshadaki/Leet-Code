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
class SwapNodesInPairs {
    public ListNode swapPairs(ListNode head) {

        if(head == null || head.next == null)
        {
            return head;
        }
        ListNode res=new ListNode();
        res.next=head;
        ListNode prev=res;
        ListNode first,second;
        while(prev.next !=null && prev.next.next !=null)
        {
            first=prev.next;
            second=first.next;

            first.next=second.next;
            second.next=first;
            prev.next=second;

            prev=first;
        }

        return res.next;
    }
}
