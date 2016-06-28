public class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums.length==0) return new int[0];
        Deque<Integer> deque = new LinkedList<Integer>();
        int[] res = new int[nums.length-k+1];
        for(int i=0;i<nums.length;i++){
            if(i>=k && deque.getLast()==nums[i-k]) deque.removeLast();  
            while(!deque.isEmpty() && deque.getFirst()<nums[i]) deque.removeFirst();
            deque.addFirst(nums[i]);
            if(i+1>=k) res[i-k+1] = deque.getLast();
        }
        return res;
    }
}