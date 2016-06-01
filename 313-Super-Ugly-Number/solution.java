public class Solution {
    public int nthSuperUglyNumber(int n, int[] primes) {
        int len = primes.length;
        int[] index = new int[len]; //index[0]==0, ... index[len-1]==0
        int[] res = new int[n];
        res[0] = 1;
        for(int i=1; i<n; i++) {
            int min = Integer.MAX_VALUE;
            for(int j=0; j<len; j++){
                min = Math.min(res[index[j]]*primes[j], min);
            }
            res[i] = min;
            for (int j=0; j<len; j++) {
                if(res[i]%primes[j]==0) index[j]++;
            }
    
        }
    
        return res[n-1];
    }
}