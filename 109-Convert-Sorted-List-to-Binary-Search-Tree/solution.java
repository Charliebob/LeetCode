/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        if(head==null) return null;
        if(head.next==null) return new TreeNode(head.val);
        ListNode fast = head;
        ListNode slow = head;
        ListNode temp = null;
        while(fast.next!=null && fast.next.next!=null){
            fast = fast.next.next;
            temp = slow;
            slow = slow.next;
        }
        if(temp!=null) temp.next= null;
        else head = null; // if there's only 2 values, slow = head, temp =null, head = null, root.left = null, root.right = slow.next;
        TreeNode root = new TreeNode(slow.val);
        root.left = sortedListToBST(head);
        root.right = sortedListToBST(slow.next);
        return root;
        
    }
}