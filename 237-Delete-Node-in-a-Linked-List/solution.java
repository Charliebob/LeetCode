/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void deleteNode(ListNode node) {
        if(node==null) return;
        if(node!=null){
            node.val = node.next.val;
            node.next = node.next.next;
        }//The idea is to copy the data of next node to current node and then delete the NEXT node
        //3->4->5  4->4->5  4-> ->5
    }
}