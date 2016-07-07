public class Solution {
    public int[] getModifiedArray(int length, int[][] updates) {
        int[] result = new int[length];
        for(int i=0; i<updates.length; i++){
            int startIndex = updates[i][0]; //startIndex
            int endIndex = updates[i][1]; //endIndex
            int Inc = updates[i][2]; //Inc
            
            result[startIndex] += Inc;
            if(endIndex<length-1)
            result[endIndex+1] -= Inc;
        }
        for(int i=1; i<length; i++){
            result[i] += result[i-1];
        }
        return result;
    }
    
}