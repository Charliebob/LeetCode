public class Solution {
    public int threeSumSmaller(int[] nums, int target) {
        int count = 0, add = 0;
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++){
            int head = i+1, tail = nums.length-1;
            while(head<tail){
                add = nums[i]+nums[head]+nums[tail];
                if(add<target){
                    count+=tail-head;
                    head++;
                }else{
                    tail--;
                }
            }
        }
        return count;
    }
}