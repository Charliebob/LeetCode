public class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length<=1) return nums.length;
        int count = 1;
        for(int i=1; i<nums.length; i++){
            if(nums[i-1]!=nums[i]){
                nums[count++]=nums[i];
            }
        }
        return count;
    }
}