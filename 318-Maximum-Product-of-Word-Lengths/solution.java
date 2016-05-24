public class Solution {
    public int maxProduct(String[] words) {
        int[] check = new int[words.length];
        for(int i=0; i<check.length; i++){
            int num=0;
            for(int j=0; j<words[i].length(); j++){
                num |= 1<<(words[i].charAt(j)-'a'); //OR bit
            }
            check[i]=num;
        }
        int max = 0;
        for(int i=0; i<words.length-1; i++){
            for(int j=i+1; j<words.length; j++){
                if((check[i]&check[j])==0) //AND bit, to see if there are common characters
                    max = Math.max(max, words[i].length()*words[j].length());
            }
        }
        return max;
    }
}