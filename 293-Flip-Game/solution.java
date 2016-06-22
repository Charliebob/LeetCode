public class Solution {
    public List<String> generatePossibleNextMoves(String s) {
        List<String> result = new ArrayList<String>();
        if(s==null || s.length()<2) return result;
        for(int i=0; i<s.length()-1; i++){
            if(s.startsWith("++",i)){
                result.add(s.substring(0,i)+"--"+s.substring(i+2));
            }
        }
        return result;
    }
}
