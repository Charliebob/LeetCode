public class Solution {
    public List<List<String>> groupStrings(String[] strings) {
        List<List<String>> res = new ArrayList<List<String>>();
        HashMap<String, List<String>> map = new HashMap<String, List<String>>();
        
        for(String word : strings){
            String key = "";
            int offset = word.charAt(0) - 'a';
            for(int i = 1; i < word.length(); i++){
                key += (word.charAt(i) - offset + 26) % 26;
            }
            
            if(!map.containsKey(key)){
                map.put(key, new ArrayList<String>());
            }
            map.get(key).add(word);
        }
        
        for(List<String> list : map.values()){
            Collections.sort(list);
            res.add(list);
        }
        return res;
    }
}

