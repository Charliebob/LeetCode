public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index1 = m-1;
        int index2 = n-1;
        int merge = m+n-1;
        while(index2>=0){
            if(index1>=0 && nums1[index1]<nums2[index2]){
                nums1[merge] = nums2[index2];
                index2--;
            }else{
                nums1[merge] = nums1[index1];
                index1--;
            }
            merge--;
        }
    }
}