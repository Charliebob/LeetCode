/* The guess API is defined in the parent class GuessGame.
   @param num, your guess
   @return -1 if my number is lower, 1 if my number is higher, otherwise return 0
      int guess(int num); */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int left = 1;
        int right = n;
        int mid = left+(right-left)/2;
        int guessNum = guess(mid);
        while(guessNum!=0){
            if(guessNum==1){
                left = mid+1;
            }
            else if(guessNum==-1){
                right = mid-1;
            }
            mid = left+(right-left)/2;
            guessNum = guess(mid);
        }
        return mid;
    }
}