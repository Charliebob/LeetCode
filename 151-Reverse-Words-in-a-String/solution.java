public class Solution {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        String res = "";
        if(words.length>0){
            for(int i=words.length-1; i>0; i--){
                res+=words[i]+" ";
            }
            res+=words[0];
        }
        return res;
    }
}
