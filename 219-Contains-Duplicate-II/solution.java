public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int i=0; i<nums.length; i++){
            if(i>k) hs.remove(nums[i-k-i]);
            if(!hs.add(nums[i])) return true;
        }
        return false;
    }
}