public class Solution {
    List<List<Integer>> list;

    public List<List<Integer>> permute(int[] nums) {
        
        list = new ArrayList<>();
        ArrayList<Integer> perm = new ArrayList<Integer>();
        backTrack(perm,0,nums);
        return list;
    }
    
    void backTrack (ArrayList<Integer> perm,int i,int[] nums){
        
        //Permutation completes
        if(i==nums.length){
            list.add(new ArrayList(perm));
            return;
        }
        
        ArrayList<Integer> newPerm = new ArrayList<Integer>(perm);
        
       //Insert elements in the array by increasing index
        for(int j=0;j<=i;j++){
            newPerm.add(j,nums[i]);
            backTrack(newPerm,i+1,nums);
            newPerm.remove(j);
        }
        
    }
}