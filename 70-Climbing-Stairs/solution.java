public class Solution {
    public int climbStairs(int n) {
        if(n<0) return 0;
        int[] result = new int[n+1];
        result[0] = 1;
        result[1] = 1;
        for(int i=2; i<n+1; i++){
            //the current steps depends on previous steps
            result[i] = result[i-1] + result[i-2];
        }
        return result[n];
    }
}