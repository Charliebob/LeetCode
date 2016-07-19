public class Solution {
    
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        List<Integer> perm = new ArrayList<Integer>();
        backTrack(list, perm, 0, nums);
        return list;
    }
    
    private void backTrack (List<List<Integer>> list, List<Integer> perm, int i, int[] nums){
        //Permutation completes
        if(i==nums.length){
            list.add(new ArrayList(perm));
            return;
        }
        List<Integer> newPerm = new ArrayList<Integer>(perm);
       //Insert elements in the array by increasing index
        for(int j=0;j<=i;j++){
            newPerm.add(j,nums[i]); //depth not j
            backTrack(list, newPerm,i+1,nums);
            newPerm.remove(j);
        }/*
        []
            [1]
                [2,1]{
                    [3,2,1] j=0  pos
                    [2,1]   j=1
                    [2,3,1]
                    [2,1]
                    [2,1,3]
                }
                [1]
                [1,2]{
                    [3,1,2]
                    [1,2]
                    [1,3,2]
                    [1,2]
                    [1,2,3]
                }
        */
        
    }
}