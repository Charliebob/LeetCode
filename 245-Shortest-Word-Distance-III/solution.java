public class Solution {
    public int shortestWordDistance(String[] words, String word1, String word2) {
        if(words.length<2) return 0;
        int index1 = -1;
        int index2 = -1;
        int result = Integer.MAX_VALUE;
        for(int i=0; i<words.length; i++){
            if(words[i].equals(word1)) index1 = i;
            if(index1!=-1 &&index2!=-1 && index1!=index2) result = Math.min(result, Math.abs(index1-index2));
            if(words[i].equals(word2)) index2 = i;
            if(index1!=-1 &&index2!=-1 && index1!=index2) result = Math.min(result, Math.abs(index1-index2));
        }
        return result;
    }
}