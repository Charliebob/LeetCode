public class Solution {
    public int findMin(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        if(nums[start]<nums[end]) return nums[0];
        while(end-start>1){
            int mid = start + (end-start)/2;
            if(nums[start]<nums[mid]) start = mid;
            else end = mid;
        }
        return nums[end];
    }
}
