public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        for(int i=0; i<magazine.length()-ransomNote.length(); i++){
            if(magazine.indexOf(i)==ransomNote) return true;
        }
        return false;
    }
}