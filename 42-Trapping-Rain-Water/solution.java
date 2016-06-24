public class Solution {
    public int trap(int[] A) {
        int left = 0, right = A.length-1;
        int level = 0, result = 0;
        while (left<right){
            level = Math.max(Math.min(A[left], A[right]), level);
            if (A[left]<=A[right]){
                result += level-A[left];
                left++;
            }
            else{
                result += level-A[right];
                right--;
            }
        }
        return result;
    }
}