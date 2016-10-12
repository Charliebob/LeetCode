public class Solution {
    private List<List<Integer>> res = new ArrayList<List<Integer>>();
    public List<List<Integer>> combinationSum3(int k, int n) {
        findCom(k,n,1, new LinkedList<Integer>());
        return res;
    }
    public void findCom(int k, int n, int start, List<Integer>list){
        if(k==1){
            if(n<start || n>9) return;
            list.add(n);
            res.add(list);
            return;
        }
        for(int i=start;  i<10; i++){
            List<Integer> subList = new LinkedList<Integer>(list);
            subList.add(i);
            findCom(k-1, n-i,i+1, subList);
        }
    }
}