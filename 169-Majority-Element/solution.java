public class Solution {
    public int majorityElement(int[] nums) {
        //voting algorithm
        int result = 0, count = 0;
        for(int i=0; i<nums.length; i++){
            if(count==0){
                result = nums[i];
            }
            if(nums[i]!=result){
                count--;
            }else{
                count++;
            }
        }
        return result;
    }
}
