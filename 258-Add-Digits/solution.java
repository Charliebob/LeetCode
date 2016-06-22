public class Solution {
    public int addDigits(int num) {
        //see result from 1 to 20, and there is a pattern
        //1 2 3 4 5 6 7 8 9
        //10 11 12 13 14 15 16 17 18
        // 1  2  3  4  5  6  7  8  9
        return (num-1)%9+1;
    }
}