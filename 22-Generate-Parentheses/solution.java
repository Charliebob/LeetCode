public class Solution {
    public List<String> generateParenthesis(int n) {
        List<String>list = new ArrayList<String>();
        backTrack(list, "",0,0,n);
        return list;
    }
    public void backTrack(List<String>list, String str, int l, int r, int max);{
        if(str.length()==max*2){
            list.add(str);
            return;
        }
        if(l<max) backTrack(list, str+"(", l+1, r, max);
        if(r<l) backTrack(list, str+")", l, r+1, max);
    }
}