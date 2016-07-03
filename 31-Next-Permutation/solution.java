public class Solution {
    public void nextPermutation(int[] nums) {
        if(nums.length<2) return;
        int index = nums.length-1;
        while(index>0){
            if(nums[index]>nums[index-1]){
                break;
            }
            index--;
        }
        if(index==0){
            Arrays.sort(nums);
        }else{
            int val = nums[index-1];
            int j = nums.length-1;
            while(j>=index){
                if(nums[j]>val) break;
                j--;
            }
            swap(nums,j,index-1);
            reverseSort(nums,index,nums.length-1);
            return;
        }
    }
    public void reverseSort(int[] nums, int start, int end){   
        if(start>end)
            return;
        for(int i=start;i<=(end+start)/2;i++)
            swap(nums,i,start+end-i);
    }
    public void swap(int[] nums, int i, int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
