public class Solution {
    public int missingNumber(int[] nums) {
        //n^n = 0; n^0 = n;
        int result = nums.length;
        for(int i=0; i<nums.length;i++){
            result ^= nums[i];
            result ^= i;
        }
        return result;
    }
}
