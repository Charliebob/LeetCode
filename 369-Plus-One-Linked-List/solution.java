/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode plusOne(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        helper(dummy);
        return dummy.val == 0 ? head : dummy;
    }
    
    private int helper(ListNode node){
        if(node == null) return 1;
        node.val += helper(node.next);
        if(node.val <= 9) return 0;
        node.val %= 10;
        return 1;
    }
}