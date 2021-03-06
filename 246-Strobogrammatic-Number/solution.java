public class Solution {
    public boolean isStrobogrammatic(String num) {
        HashMap<Character, Character> map = new HashMap<Character, Character>();
        map.put('0','0');
        map.put('1','1');
        map.put('6','9');
        map.put('8','8');
        map.put('9','6');
        for(int i=0; i<num.length(); i++){
            if(!map.containsKey(num.charAt(i))) return false;
            if(map.get(num.charAt(i))!=num.charAt(num.length()-1-i)) return false;
        }
        return true;
    }
}