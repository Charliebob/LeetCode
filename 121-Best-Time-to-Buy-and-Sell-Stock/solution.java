public class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int min = Integer.MAX_VALUE;
        for(int p:prices){
            min = Math.min(p, min);
            max = Math.max(p-min, max);
        }
        return max;
    }
}