public class Solution {
    public int minPatches(int[] nums, int n) {
        int count = 0;
        int index = 0;
        long sum = 0;
        while(sum<n){
            if(index>=nums.length || nums[index]>sum+1){
                ++count;
                sum = (sum<<1)+1;
            }else{
                sum+=nums[index++];
            }
        }
        return count;
    }
}
