/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 * @author Charliebob
 * @version March 22nd, 2016
 * 
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        //Define a new null node
        ListNode newHead = null;
        //loop until head reach null, the end of the list
        while(head!=null){
            //save the next node as the head.next
            ListNode next = head.next;
            //the next node of head point to newHead which is previous node
            head.next = newHead;
            //new head move to next one, which is head
            newHead = head;
            //head move to next node which is node
            head = next;
        }
        /**
         * @return return newHead which is the head of the reversed list head
        */
        return newHead;
    }
}