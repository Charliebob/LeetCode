public class Solution {
    public int numTrees(int n) {
        int[] tree = new int[n+1];
        tree[0] = 1;
        tree[1] = 1;
        for(int i=2; i<=n; i++){
            //int sum = 0;
            for(int j=0; j<i; j++){
                tree[i]+=tree[j]*tree[i-j-1];
            }
            //tree[i] = sum;
        }
        return tree[n];
    }
}