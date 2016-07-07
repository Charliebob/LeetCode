public class Solution {
    public int[] getModifiedArray(int length, int[][] updates) {
        int[] result = new int[length];
        for(int i=0; i<updates.length; i++){
            int startIndex = updates[i][0]; //startIndex
            int endIndex = updates[i][1]; //endIndex
            int Inc = updates[i][2]; //Inc
            for(int j=startIndex; j<=endIndex; j++){
                result[j]+=Inc;
            }
        }
        return result;
    }
    
}