public class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount+1];
        dp[0] = 0;
        for(int i=0; i<amount; i++){
            for(int j=i; j<coins.length; j++){
                dp[i] = Math.min(dp[i]+1, dp[i+coins[i]]);
            }
        }
        return dp[amount];
    }
}