public class Solution {
    public int[] singleNumber(int[] nums) {
        int[] result = new int[2];
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int i=0; i<nums.length; i++){
            if(hs.contains(nums[i])) hs.remove(nums[i]);
            else hs.add(nums[i]);
        }
        int count = 0;
        for(Integer val : hs) result[count++] = val;
        return result;
    }     
}