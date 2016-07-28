public class Solution {
    public int maxCoins(int[] nums) {
        int[] num = new int[nums.length+2];
        int n = 1;
        for(int x: nums) num[n++] = x;
        num[0] = num[n++] = 1;
        int[][] dp = new int[n][n];
        for(int len=1; len<n-1; len++){ //len=2?
            for(int left = 0; left <n-len-1; left++){
                int right = left + len + 1;
                for(int i=left+1; i<right; i++){
                    dp[left][right] = Math.max(dp[left][right], num[left]*num[i]*num[right]+dp[left][i]+dp[i][right]);
                }
            }
        }
        return dp[0][n-1];
    }
}
    