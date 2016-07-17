public class Solution {
    public int rob(int[] nums) {
        if(nums==null || nums.length==0) return 0; 
        if(nums.length==1) return nums[0];
        int max1 = robHelper(nums, 0, nums.length-2); //rob the first one, cannot rob the last one
        int max2 = robHelper(nums, 1, nums.length-1); //rob the last one, cannot rob the first one
        return Math.max(max1, max2); //return the bigger one
    }
    private int robHelper(int[] nums, int i, int j){
        if(i==j) return nums[i];
        int[] dp = new int[nums.length];
        dp[i]=nums[i];
        dp[i+1]=Math.max(nums[i+1], dp[i]);
        for(int k=i+2; k<=j; k++){
            dp[k]=Math.max(dp[k-1], dp[k-2]+nums[k]);    
        }
        return dp[j];
    }
}
