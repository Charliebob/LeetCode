public class Solution {
    public int longestConsecutive(int[] nums) {
        int T[] = new int[nums.length];
        //int actualSolution[] = new int[arr.length];
        for(int i=0; i < nums.length; i++){
            T[i] = 1;
            //actualSolution[i] = i;
        }
        
        for(int i=1; i < nums.length; i++){
            for(int j=0; j < i; j++){
                if(nums[i] > nums[j]){
                    T[i] = Math.max(T[i], T[j]+1);
                    // if(T[j] + 1 > T[i]){
                    //     T[i] = T[j] + 1;
                    //     //set the actualSolution to point to guy before me
                    //     actualSolution[i] = j;
                    // }
                }
            }
        }
        return T[nums.length];
    }
}