public class Solution {
    public int lengthLongestPath(String input) {
        Stack<Integer> stack = new Stack<>();
        int total = 0;
        int maxlen = 0;
        for(int i = 0; i < input.length();){
            char c = input.charAt(i);
            if(c == '\n'){
                int begin = ++i;
                while(input.charAt(i) == '\t'){
                    i++;
                }
                while(stack.size() > i - begin){
                    total -= stack.pop();
                }
            }else{
                int begin = i;
                boolean file = false;
                while(i < input.length() && (c = input.charAt(i)) != '\n'){
                    if(c == '.'){
                        file = true;
                    }
                    i++;
                }
                stack.push(i - begin);
                total += stack.peek();
                if(file){
                    maxlen = Math.max(total + stack.size() - 1, maxlen);
                }
            }
        }
        return maxlen;
    }
}