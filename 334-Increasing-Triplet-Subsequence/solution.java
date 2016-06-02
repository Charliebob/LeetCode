public class Solution {
    public boolean increasingTriplet(int[] nums) {
        int small = Integer.MAX_VALUE, big = Integer.MAX_VALUE;
        for (int n : nums) {
            if (n <= small) { small = n; } // update small if n is smaller than both
            else if (n <= big) { big = n; } // update big only if greater than small but smaller than big
            else return true; // return if you find a number bigger than both
        }
        return false;
    }
}


        
        
        // int[] res = new int[3];
        // int len = 0;
        // for(int num:nums){
        //     if(len==0 || num>res[len-1]){
        //         res[len++]=num;
        //         if(len==3) return true;
        //     }else{
        //         int i=0;
        //         while(res[i]<num)i++;
        //         res[i]=num;
        //     }
        // }
        // return false;