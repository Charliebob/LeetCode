public class Solution {
    public int[] searchRange(int[] nums, int target) {
        return searchRange(nums, 0, nums.length-1, target);
        
    }
    public int[] searchRange(int[] A, int l, int r, int target){
        int[] result = new int[] {-1, -1};
        while(l<=r){
            int mid = (l+r)/2;
            if(A[mid] < target){
                l=mid+1;
            }else if(A[mid] > target){
                r = mid -1;
            }else{
                int[] left = searchRange(A, l, mid -1, target);
                result[0] = left[0] == -1 ? mid: left[0];
                
                int[] right = searchRange(A, mid+1, r, target);
                result[1] = right[0] == -1 ? mid: right[1];
                break;
               
            }
        }
        return result;
    }
}