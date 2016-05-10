/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode cur = dummy; //cur->head, cur.next is head
        ListNode l1 = null, l2 = null;
        while(cur.next!=null && cur.next.next!=null){
            l1 = cur.next;  //head;
            l2 = cur.next.next;  //head.next;  1 -> 2 ->3
            l1.next = l2.next;   //  1->3
            l2.next = l1;
            cur.next = l2;
            cur = l1;
        }
        return dummy.next;
    }
}
