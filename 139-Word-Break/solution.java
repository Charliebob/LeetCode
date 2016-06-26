public class Solution {
    public boolean wordBreak(String s, Set<String> wordDict) {
        int n = s.length();
        boolean[] canWordBreak = new boolean[n + 1];
        int minLength = Integer.MAX_VALUE;
        int maxLength = Integer.MIN_VALUE;
        for(String str : wordDict) {
            minLength = Math.min(minLength, str.length());
            maxLength = Math.max(maxLength, str.length());
        }
        canWordBreak[0] = true;
        for(int i = minLength; i <= n; i++) {
            for(int j = i - minLength; j >= 0 && j >= i - maxLength; j--) {
                if(canWordBreak[j] && wordDict.contains(s.substring(j, i))) {
                    canWordBreak[i] = true;
                    break;
                }
            }
        }
        return canWordBreak[n];
    }
}
