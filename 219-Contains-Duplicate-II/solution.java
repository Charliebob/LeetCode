public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(nums==null||nums.length==0||k==0) return false;
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int i=0; i<nums.length; i++){
            if(i>k) {
                hs.remove(nums[i-k-1]);
            }
            else{
                if(!hs.add(nums[i])) return false;
            } 
        }
        return true;
    }
}