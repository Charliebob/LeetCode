public class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        //key: nums[i], value: times;
        for(int i=0; i<nums.length; i++){
            int times;
            if(hm.containsKey(nums[i])){
                times = hm.get(nums[i])+1;
            }else{
                times = 1;
            }if(times>nums.length/2){
                return nums[i];
            }hm.put(nums[i], times);
        }
        return 0;
    }
}
