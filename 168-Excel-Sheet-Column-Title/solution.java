public class Solution {
    public String convertToTitle(int n) {
        String s= "";
        while(n!=0){
            s = (char)('A'+(n-1)%26)+s;
            n = (n-1)/26;
        }
        return s;
    }
}