public class Solution {
    public int combinationSum4(int[] nums, int target) {
        if (nums == null || nums.length == 0 || target < 0) {
            return 0;
        }
    	int[] combs = new int[target + 1];
    	combs[0] = 1;
    	for (int i = 1; i <= target; i++) {
    		for(int num: nums){
    			if (i - num >= 0) {
    				combs[i] += combs[i - num];
    			}
    		}
    	}
    	return combs[target];
    }
}