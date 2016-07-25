public class Solution {
    public int longestValidParentheses(String s) {
        int maxLen=0;
        int lp=0,rp=0;
        int potentialPos=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(') lp++;
            else rp++;
            if(rp>lp){
                maxLen=Math.max(maxLen,2*lp);
                potentialPos=i+1;
                lp=0;
                rp=0;
            }else if(rp==lp){
                maxLen=Math.max(maxLen,lp+rp);
            }else if(i==s.length()-1){//rp<lp,end of string
                rp=0;
                lp=0;
                for(int j=i;j>=potentialPos;j--){
                    if(s.charAt(j)=='(') lp++;
                    else rp++;
                    if(rp<lp){
                        maxLen=Math.max(maxLen,2*rp);
                        lp=0;
                        rp=0;
                    }
                }
            }
        }
        return maxLen;
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