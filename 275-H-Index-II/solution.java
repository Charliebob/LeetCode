public class Solution {
    public int hIndex(int[] citations) {
        int len = citation.length;
        int lo = 0, hi = len-1;
        while(lo<=hi){
            int mid = (hi+lo)/2;
            if(citations[mid]==len-mid){
                return len-mid;
            }else if(citations[mid]<len-mid){
                lo = mid+1;
            }else{
                hi = mid-1;
            }
        }
        return len-lo;
    }
}
