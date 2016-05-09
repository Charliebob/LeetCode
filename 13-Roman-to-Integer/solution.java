public class Solution {
    public int romanToInt(String s) {
        if(s==null || s.length()==0) return 0;
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        int length = s.length();
        hm.put('I', 1);
        hm.put('V', 5);
        hm.put('X', 10);
        hm.put('L', 50);
        hm.put('C', 100);
        hm.put('D', 500);
        hm.put('M', 1000);
        int result = hm.get(s.charAt(length-1));
        int previous = result;
        for(int i=length-2; i>=0; i--){ //i-- not i++
            int cur = hm.get(s.charAt(i)); 
            if(cur>=previous){
                result+=cur;
            }else{
                result-=cur;
            }
            previous=cur;
        }
        return result;
    }
}
