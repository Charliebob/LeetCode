public class Solution {
    public List<String> findMissingRanges(int[] nums, int lower, int upper) {
        List<String> result = new ArrayList<String>();
        if(nums==null) return result;
        if(nums.length==0){
            if(lower==upper){
                return Integer.toString(lower);
            }else{
                return lower+"->"+upper;
            }
        }
        if(lower+2<nums[0]) result.add(lower+"->"+(nums[0]-1));
        else if(lower+2==nums[0]) result.add(Integer.toString(lower+1));
        for(int i=1; i<nums.length; i++){
            if(nums[i-1]+1==nums[i]||nums[i-1]==nums[i]) continue;
            else if(nums[i-1]+2==nums[i]){
                result.add(Integer.toString(nums[i-1]+1));
            }else if(nums[i-1]+2<nums[i]){
                result.add(nums[i-1]+1 +"->"+(nums[i]-1));
            }
        }
        if(nums[nums.length-1]+2<upper){
            result.add(nums[nums.length-1]+1 + "->" + upper);
        }else if(nums[nums.length-1]+2==upper){
            result.add(Integer.toString(upper-1));
        }
        return result;
    }
}