public class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        int max = 1;
        for(int item: nums){
            set.add(item);
        }
        for(int item: nums){
            int left = item-1;
            int right = item+1;
            int count = 1;
            while(set.contains(left)){
                count++;
                set.remove(left);
                left--;
            }
            while(set.contains(right)){
                count++;
                set.remove(right);
                right++;
            }
            max = Math.max(max, count);
        }
        return max;
    }
}
