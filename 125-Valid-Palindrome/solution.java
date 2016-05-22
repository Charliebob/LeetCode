public class Solution {
    public boolean isPalindrome(String s) {
        Stack<Character> stack = new Stack<Character>();
        Queue<Character> queue = new LinkedList<Character>();
        s = s.toLowerCase();
        for(int i=0; i<s.length(); i++){
            //Character is a wrapper class
            Character c = s.charAt(i);
            if(c.isLetterOrDigit(c)){
                stack.push(c);
                queue.add(c);
            }
        }
        while(!stack.isEmpty()){
            if(stack.pop()!=queue.poll())
                return false;
        }
        return true;
    }
}

//character  queue用linkedlist表示  s。charAt   isAlphabetic isDigit   queue用poll（）  stack 用pop（）
