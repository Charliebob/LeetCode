public class Solution {
    public void wiggleSort(int[] nums) {
        for(int i=1; i<nums.length; i++){
            int a = nums[i-1];
            if((i%2==1)==(a>nums[i])){  //奇数点和前面的数互换！
                nums[i-1] = nums[i];
                nums[i] = a;
            }
        }
    }
}
