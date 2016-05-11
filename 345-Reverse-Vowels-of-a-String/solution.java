public class Solution {
    public String reverseVowels(String s) {
        // char[] vowels = {'a','e','i','o','u'};
        // int indexBack = s.length()-1;
        // for(int i=0; i<s.length()/2; i++){
        //     if(s.charAt(i))
        // }
        if(s==null || s.length()==0) return s;
        String vowels = "aeiouAEIOU";
        char[] chars = s.toCharArray();
        int start = 0;
        int end = s.length()-1;
        while(start<end){
            while(start<end && !vowels.contains(chars[start]+"")){
                start++;
            }
            while(start<end && !vowels.contains(chars[end]+"")){
                end--;
            }
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }
        return new String(chars);
    }
}
