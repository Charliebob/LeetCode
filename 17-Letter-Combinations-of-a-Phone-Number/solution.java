public class Solution {
    public List<String> letterCombinations(String digits) {
         String[] keys = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
         List<String> result = new ArrayList<String>();
         if(digits.length()==0) return result;
         StringBuilder temp = new StringBuilder(); 
        dfs(digits, keys, 0, temp, result);
        return result;
    }
    
    public void dfs(String digits, String[] keys, int deep, StringBuilder temp, List<String> ret){
        if(deep == digits.length()){
            ret.add(temp.toString());
            return;
        }
        else{
            for(int i = 0; i < keys[digits.charAt(deep) - '0'].length(); i++){
                temp.append(keys[digits.charAt(deep) - '0'].charAt(i));
                dfs(digits, keys, deep+1, temp, ret);
                temp.deleteCharAt(temp.length()-1);
            }
        }
    }
}
