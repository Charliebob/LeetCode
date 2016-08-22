public class Solution {
    public void solve(int curr, int n, List<Integer> ret){
        if(curr > n){//curr is the number
            return;
        }
        ret.add(curr);
        for(int i = 0; i < 10; i++){//append 0-9 to the end of curr 
            if(curr*10 + i <= n){//recurse as long as its less than n
                solve(curr*10 + i, n, ret);
            } else break;
        }
    }
    public List<Integer> lexicalOrder(int n) {
        List<Integer> ret = new ArrayList<Integer>();
        for(int i = 1; i < 10; i++){//fix first digit
            solve(i, n, ret);
        }
        return ret;
    }
}