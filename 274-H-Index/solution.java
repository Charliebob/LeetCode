public class Solution {
    public int hIndex(int[] citations) {
        if(citations==null || citations.length==0) return 0;
        Arrays.sort(citations);
        int left = 0;
        int right = citations.length-1;
        int mid = left + (right-left)/2;
        while(left<right){
            if((citations[mid]>mid-1)&&(citations[mid]<=right-mid+1)){
                return mid;
            }else if(citations[mid]<mid-1){
                mid++;
            }else{
                mid--;
            }
        }
        return 0;
    }
}