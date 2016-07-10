public class Solution {
    public boolean isReflected(int[][] points) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        HashSet<String> set = new HashSet<>();
        for(int[] p:points){
            max = Math.max(max,p[0]);
            min = Math.min(min,p[0]);
            String str = p[0] + "a" + p[1]; //p[0]==x  p[1]==y
            set.add(str);
        }
        int sum = max+min;
        for(int[] p:points){
            //int[] arr = {sum-p[0],p[1]};
            String str = (sum-p[0]) + "a" + p[1]; //find symmetric
            if( !set.contains(str))
                return false;
        }
        return true;
    }
}