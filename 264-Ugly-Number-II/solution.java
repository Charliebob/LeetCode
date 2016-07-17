public class Solution {
    public int nthUglyNumber(int n) {
        if(n<=0) return 0;
        int a=0, b=0, c=0;
        List<Integer> table = new ArrayList<Integer>();
        table.add(1);
        while(table.size()<n){
            int nextValue = Math.min(table.get(a)*2, Math.min(table.get(b)*3, table.get(c)*5));
            table.add(nextValue);
            if(table.get(a)*2 == nextValue) a++;
            if(table.get(b)*3 == nextValue) b++;
            if(table.get(c)*5 == nextValue) c++;
        }
        return table.get(table.size()-1);
    }
}
