public class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
       List<Integer> largest = new ArrayList<>();
       Arrays.sort(nums);
       for (int i=nums.length-1;i>=0;i--){
           List<Integer> l = new ArrayList<>();
           l.add(nums[i]);
           for (int j=i-1;j>=0;j--)
               if (l.get(l.size()-1)%nums[j]==0)
                   l.add(nums[j]);
           if (l.size()>largest.size())
               largest = l;

       }
       return largest;
        
    }
}