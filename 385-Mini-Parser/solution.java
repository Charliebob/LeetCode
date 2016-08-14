/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 *     // Constructor initializes an empty nested list.
 *     public NestedInteger();
 *
 *     // Constructor initializes a single integer.
 *     public NestedInteger(int value);
 *
 *     // @return true if this NestedInteger holds a single integer, rather than a nested list.
 *     public boolean isInteger();
 *
 *     // @return the single integer that this NestedInteger holds, if it holds a single integer
 *     // Return null if this NestedInteger holds a nested list
 *     public Integer getInteger();
 *
 *     // Set this NestedInteger to hold a single integer.
 *     public void setInteger(int value);
 *
 *     // Set this NestedInteger to hold a nested list and adds a nested integer to it.
 *     public void add(NestedInteger ni);
 *
 *     // @return the nested list that this NestedInteger holds, if it holds a nested list
 *     // Return null if this NestedInteger holds a single integer
 *     public List<NestedInteger> getList();
 * }
 */
public class Solution {
    public NestedInteger deserialize(String s) {
    Stack<NestedInteger> stk = new Stack<>();
        Reader input = new Reader(s);
        NestedInteger cur = null;
        while(input.hasNext()){
            String next = input.next();
            if(next.equals("[")){
                if(cur!=null){
                    stk.push(cur);
                }
                cur = new NestedInteger();
            }
            else if(next.equals("]")){
                if(!stk.isEmpty()){
                    stk.peek().add(cur);
                    cur = stk.pop();
                }
            }
            else{
                int val = Integer.valueOf(next);
                if(cur==null){
                    cur = new NestedInteger(val);
                }
                else{
                    cur.add(new NestedInteger(val));
                }
            }
        }
        return cur;
    }
    
    class Reader{   // a helper class that passes input string into useful elements
        String str;
        int p, len;
        public Reader(String s){
            str = s;
            p = 0;
            len = str.length();
        }
        public boolean hasNext(){
            return p<len;
        }
        public String next(){
            if(str.charAt(p)==',') p++;
            int s = p;
            while(p<len && (str.charAt(p)=='-' || Character.isDigit(str.charAt(p)))) p++;
            if(s!=p) return str.substring(s,p);
            return str.substring(s,++p);
        }
    }
}