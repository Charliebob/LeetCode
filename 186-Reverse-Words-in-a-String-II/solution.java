public class Solution {
    public void reverseWords(char[] s) {
        int start = 0;
        int end = s.length-1;
        
        reverse(s, start, end);
        for(int i=0; i<s.length; i++){
            if(s[i]==' '){
                reverse(s, start, i-1);
                start = i+1;
            }
            
        }
        reverse(s, start, end);
    }
    
    public void reverse(char[]s, int start, int end){
        while(start<end){
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
    }
}