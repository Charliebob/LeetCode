public class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        boolean [][] dp = new boolean[s1.length()+1][s2.length()+1];
        if(s3.length()!=s1.length()+s2.length()) return false;
        // if(s1==null && s2==null && s3==null) return true;
        // if(s1.length()==0 && s2.length()==0 &&s3.length()==0) return true;
        dp[0][0] = true;
        for(int i=1; i<s1.length(); i++){
            if(s1.charAt(i-1) == s3.charAt(i-1)){
                dp[0][i] = dp[0][i-1];
            }
            
        }
        for(int i=1; i<s2.length(); i++){
            if(s2.charAt(i-1) == s3.charAt(i-1)){
                dp[i][0] = dp[i-1][0];
            }
        }
        for(int i=1; i<s1.length(); i++){
            for(int j=1; j<s2.length(); j++){
                if(s3.charAt(i+j-1)==s1.charAt(i)){
                    dp[i][j] = dp[i-1][j];
                }
                if(s3.charAt(i+j-1)==s2.charAt(j)){
                    dp[i][j] = dp[i][j-1];
                }else{
                    dp[i][j] = false;
                }
            }
        }
        return dp[s1.length()][s2.length()];
    }
}