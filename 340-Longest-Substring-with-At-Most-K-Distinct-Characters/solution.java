public class Solution {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        Map<Character, Integer> map = new HashMap<>();
        int left = 0;
        int max = 0;
        for(int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);//java8
            while (map.size() > k) {
                char leftChar = s.charAt(left);
                if (map.containsKey(leftChar)) {
                    map.put(leftChar, map.get(leftChar) - 1);                     
                    if (map.get(leftChar) == 0) { 
                        map.remove(leftChar);
                    }
                }
                left++;
            }
            max = Math.max(max, i - left + 1);
        }
        return max;   
    }
}