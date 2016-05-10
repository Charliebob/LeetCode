public class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE; //define the max as min 
        int max = 0;                 //define the min as max
        for(int p: prices){
            min = Math.min(min, p);
            max = Math.max(p-min, max);
        }
        return max;
    }
}
