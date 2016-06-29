public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if(nums==null || nums.length<3) return result;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            int low = i+1;
            int high = nums.length -1;
            while(low<high){
                if(nums[i]+nums[low]+nums[high]==0){
                    result.add(Arrays.asList(nums[i], nums[low], nums[high]));
                    while(i+1<nums.length && nums[i+1]==nums[i]) i++;
                    while(low+1<nums.length && nums[low]==nums[low+1]) low++;
                    while(high-1>=0 && nums[high]==nums[high-1]) high--;
                    //same result, if there are some equally numbers
                    low++;
                    high--;
                } else if(nums[i]+nums[low]+nums[high]>0) high--;
                else low++;
            }
        }
        return result;
    }
    
}