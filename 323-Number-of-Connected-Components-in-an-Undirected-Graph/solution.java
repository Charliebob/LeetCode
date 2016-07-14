public class Solution {
    public int countComponents(int n, int[][] edges) {
        int[] id = new int[n];
        //initialization
        for(int i=0; i<n; i++) id[i] = i;
        //union
        for(int[] edge: edges){
            int i = root(id, edge[0]);
            int j = root(id, edge[1]);
            id[i] = j;
        }
        //find number of root
        int count = 0;
        for(int i=0; i<n; i++){
            if(id[i]==i) count++;
        }
        return count;
        
    }
    //find root id
    public int root(int[] id, int i){
        while(i!=id[i]){
            id[i] = id[id[i]];
            i = id[i];
        }
        return i;
    }
}