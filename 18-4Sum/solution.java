public class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result= new ArrayList<List<Integer>>();
        if(nums==null || nums.length<4) return result;
        Arrays.sort(nums);
        for(int i=0; i<nums.length-3; i++){
            for(int j=i+1; j<nums.length-2; j++){
                int head = j+1;
                int tail = nums.length-1;
                while(head<tail){
                    int tempSum = nums[i]+nums[j]+nums[head]+nums[tail];
                    if(tempSum==target){
                        List<Integer> item = new ArrayList<Integer>();
                        item.add(nums[i]);
                        item.add(nums[j]);
                        item.add(nums[head]);
                        item.add(nums[tail]);
                        if(!result.contains(item)){
                            result.add(item);
                        }
                        head++;
                        tail--;
                    }else if(tempSum<target){
                        head++;
                    }else{
                        tail--;
                    }
                }
            }
        }
        return result;
    }
}

