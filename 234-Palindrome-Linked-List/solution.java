/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head==null) return true;
        ListNode fast = head;
        ListNode slow = head;
        while(fast.next!=null && fast.next.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        
        ListNode newHead = reverse(slow);
        
        while(head!=null && newHead!=null){
            if(newHead.val!=head.val) return false;
            head = head.next;
            newHead = newHead.next;
        }
        return true;
    }
    
    public ListNode reverse(ListNode root){
        ListNode temp = null;
        while(root!=null){
            ListNode next = root.next;
            root.next = temp;
            temp = root;
            root = next;
        }
        return temp;
    }
}
