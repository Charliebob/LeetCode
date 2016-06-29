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
        if(head==null) return head;
        ListNode dummy = head;
        ListNode last = reverse(dummy);
        ListNode dummyLast = last;
        while(last!=null){
            if(last.val<9) {
                last.val++; 
                break;
            }
            else{
                last.val=0;
                last = last.next;
            }
        }
        ListNode reverseBack = reverse(dummyLast);
        if(reverseBack.val==0){
            ListNode node = new ListNode(1);
            node.next = reverseBack;
            return node;
        }
        return reverseBack;
    }
    private ListNode reverse(ListNode node){
        ListNode d = null;
        while(node!=null){
            ListNode temp = node.next;
            node.next = d;
            d = node;
            node = temp;
        }
        return d;
    }
    
}