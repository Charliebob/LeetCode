public class Solution {
    public boolean wordBreak(String s, Set<String> wordDict) {
        if(s==null || s.length()==0) return false;
        int n = s.length();
        boolean[] dp = new boolean[n];
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                String sub = s.substring(j, i+1);
                if(wordDict.contains(sub) && (j==0 || dp[j-1])){
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[n-1];
    }
}
