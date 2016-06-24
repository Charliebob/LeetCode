public class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s==null && t==null) return true;
        if(s==null || t==null) return false;
        if(s.length()!=t.length()) return false;
        
        HashMap<Character, Character> hm = new HashMap<Character, Character>();
        for(int i=0; i<s.length(); i++){
            Character sChar = s.charAt(i);
            Character tChar = t.charAt(i);
            if(hm.containsKey(sChar)){
                if(hm.get(sChar)!=tChar)
                    return false;
            }else if(hm.containsValue(tChar)){ //S:"ab" T:"aa";
                 return false;
            }else{
                hm.put(sChar, tChar);
            }
        }
        return true;
    }
}