public class Solution {
    public boolean canPartition(int[] nums) {
        if (nums == null || nums.length == 0) return true;
        int sum = 0;
        for(int i: nums){
            sum+=i;
        }
        if(sum%2!=0) return false;
        sum/=2;
        boolean[] dp = new boolean[sum+1];
        dp[0] = true;
        for(int i=1; i<nums.length; i++){
            for(int j=sum; j>=nums[i-1]; j--){
                dp[j] = dp[j] || dp[j-nums[i-1]];
            }
        }
        return dp[sum];
    }
}