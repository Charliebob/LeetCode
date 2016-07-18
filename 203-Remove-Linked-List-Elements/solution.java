/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        while(head!=null && head.val==val) head = head.next;
        if(head==null) return head;
        ListNode dummy = head;
        while(dummy.next!=null){
            if(dummy.next.val==val){
                dummy.next = dummy.next.next;
            }else{
                dummy = dummy.next;
            }
        }
        return head;
    }
}
