public class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> res = new ArrayList<String>();
        if(s==null ||s.length() < 10) return res;
        HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();
        
        for(int i=0; i+10<=s.length();i++){
            int hash = stringToHash(s.substring(i, i + 10));
            if(map.containsKey(hash)){
                if(!map.get(hash)){
                    res.add(s.substring(i,i+10));
                    map.put(hash, true);
                }
            }else{
                map.put(hash, false);
            }
        }
        return res;
    }
    
    private int stringToHash(String s){
        StringBuilder numberBuilder = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 'A') numberBuilder.append("0");
            if(s.charAt(i) == 'C') numberBuilder.append("1");
            if(s.charAt(i) == 'G') numberBuilder.append("2");
            if(s.charAt(i) == 'T') numberBuilder.append("3");
        }
        return Integer.parseInt(numberBuilder.toString,4);
    }
    
}
