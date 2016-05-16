public class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        //if nums array length is 0 return empty list
        if(nums.length==0) return result;
        //define an inside list
        List<Integer> l0 = new ArrayList<Integer>();
        l0.add(nums[0]);
        result.add(l0);
        for(int i=1; i<nums.length; ++i){
            List<List<Integer>> new_result = new ArrayList<List<Integer>>();
            for(int j=0; j<=i; ++j){
                for(List<Integer>l: result){
                    List<Integer> new_l = new ArrayList<Integer>(l);
                    new_l.add(j, nums[i]);
                    new_result.add(new_l);
                }
            }
            result = new_result;
        }
        return result;
    }
}