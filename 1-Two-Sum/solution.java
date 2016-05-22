public class Solution {
    public int[] twoSum(int[] nums, int target) {
        /**
         * @author Charliebob
         * This method is to return the indices of the two numbers such that they add up to a specific target
        */
        //Define the result array, size is 2
        int[] result = new int[2];
        //Hashmap Key: number, Value: index
        HashMap<Integer, Integer> hm = new HashMap<Integer,Integer>();
        //loop the whole list
        for(int i=0; i<nums.length; i++){
            //if found
            if(hm.containsKey(target-nums[i])){
                //save the result;
                result[0] = hm.get(target-nums[i]);
                result[1] = i;
            }else{
                //if not, save to the hashmap
                hm.put(nums[i], i);
            }
        }
        /**
         * @return result
        */
        return result;
        
    }
}