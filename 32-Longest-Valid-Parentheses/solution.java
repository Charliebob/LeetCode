public class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<Integer>();
        int max=0;
        int left = -1;
        for(int j=0;j<s.length();j++){
            if(s.charAt(j)=='(') stack.push(j);            
            else {
                if (stack.isEmpty()) left=j;
                else{
                    stack.pop();
                    if(stack.isEmpty()) max=Math.max(max,j-left);
                    else max=Math.max(max,j-stack.peek());
                   }
                }
            }
        return max;
    }
}


        
        //int max=0,start=0;
        // Stack<Integer> stack=new Stack();
        // int[] a=new int[s.length()];
        // char[] c=s.toCharArray();
        // for(int i=0;i<c.length;i++){
        //     if(c[i]=='(') stack.push(i);
        //     else if(!stack.empty()){
        //         start=stack.pop();
        //         a[i]=i-start+1;
        //         if(start>1) a[i]+=a[start-1];
        //         max=Math.max(max,a[i]);
        //     }
        // }
        // return max;