public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<List<String>>();
        Map<String, Integer> map = new HashMap<String, Integer>(); //for each anagram word saves the index
        //Arrays.sort(strs);
        for(String str: strs){
            char[] c = str.toCharArray();
            Arrays.sort(c);
            String string = new String(c);
            if(map.containsKey(string)){
                List<String> li = result.get(map.get(string));
                li.add(str);
            }else{
                List<String> li = new ArrayList<String>();
                li.add(str);
                result.add(li);
                map.put(string, result.size()-1);
            }
        }
        return result; 
    }
}
