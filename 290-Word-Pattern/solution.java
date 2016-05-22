public class Solution {
    public boolean wordPattern(String pattern, String str) {
        String[] stringArray = str.split(" ");
        int length = pattern.length();
        if(stringArray.length!=length) return false;
        HashMap<Character, String> hm = new HashMap<Character, String>();
        for(int i=0; i<length; i++){
            char c= pattern.charAt(i);
            if(hm.containsKey(c) && !hm.get(c).equals(stringArray[i])) return false;
            else if(!hm.containsKey(c) && hm.containsValue(stringArray[i])) return false;
            else hm.put(c, stringArray[i]);
        }
        return true;
    }
}