public class Solution {
    public char findTheDifference(String s, String t) {
        int[] alphabet = new int[26];
        for(int i=0; i<s.length(); i++){
            alphabet[s.charAt(i)-'a']--;
        }
        for(int i=0; i<t.length(); i++){
            alphabet[t.charAt(i)-'a']++;
        }
        int index = 0;
        while(alphabet[index]==0){
            index++;
        }
        return (char)('a'+index);
    }
}