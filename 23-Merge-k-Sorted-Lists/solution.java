/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists==null || lists.length==0) return null;
        PriorityQueue<ListNode> queue = new PriorityQueue<ListNode>(lists.length, new Comparator<ListNode>(){
            @Override
            public int compare(ListNode o1, ListNode o2){
                return o1.val-o2.val;
            }
        });
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        for(ListNode node: lists){
            if(node!=null)
                queue.add(node);
        } //k size, only head been added to the queue
        while(!queue.isEmpty()){
            tail.next = queue.poll();
            tail = tail.next;
            if(tail.next!=null) //for current list if there's another node after ,add
                queue.add(tail.next);
        }
        return dummy.next;
    }
}
