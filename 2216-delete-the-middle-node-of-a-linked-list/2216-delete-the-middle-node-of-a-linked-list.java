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
    public ListNode deleteMiddle(ListNode head) {
        ListNode cur=head;
        ListNode next=head;
        if(head.next==null || head==null)
        {
            return null;
        }
        if(head.next.next==null)
        {
            head.next=null;
            return head;
        }
        ListNode prev=head;
        while(next !=null && next.next!=null)
        {
            prev=cur;
            cur=cur.next;
            next=next.next.next;
        }
        prev.next=cur.next;
        cur.next=null;
        return head;        
    }
}