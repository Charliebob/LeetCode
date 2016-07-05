public class Solution {
    public int ladderLength(String beginWord, String endWord, Set<String> wordList) {
        LinkedList<String> queue = new LinkedList<String>();
        queue.add(beginWord);
        wordList.add(endWord);
        int step = 0;
    
        while (!queue.isEmpty()) {
            LinkedList<String> level = new LinkedList<String>();
            step++;
            while (!queue.isEmpty()) {
                String q = queue.poll();
                if(q.equals(endWord))
                    return step;
    
                char[] t = q.toCharArray();
                for(int i = 0; i < beginWord.length(); i++){
                    for(char c = 'a'; c <= 'z'; c++){
                        char temp = t[i];
                        t[i] = c;
                        String s = String.valueOf(t);
                        t[i] = temp;
                        if(wordList.contains(s)){
                            level.add(s);
                            wordList.remove(s);
                        }
                    }
                }
            }
            queue = level;
        }
    
        return 0;
    }
}
