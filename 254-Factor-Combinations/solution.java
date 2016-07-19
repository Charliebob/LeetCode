public class Solution {
    public List<List<Integer>> getFactors(int n) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        breakDown(result, new ArrayList<Integer>(), n, 2);
        return result;
    }
    private void breakDown(List<List<Integer>> result, List<Integer> item, int n, int start){
        if(n<=1 && item.size()>1){
            //if(){
                result.add(new ArrayList<Integer>(item));
            //}
            return;
        }
        for(int i=start; i<=n; i++){
            if(n%i==0){
                item.add(i);
                breakDown(result, item, n/i, i);
                item.remove(item.size()-1); //remove the last one
            }
        }
    }
}
