public class Solution {
    public int uniquePaths(int m, int n) {
        int[][] step = new int[m][n];
        for(int i=0; i<m; i++){
            step[i][0] = 1;
        }
        for(int j=0; j<n; j++){
            step[0][j] = 1;
        }
        for(int i=1; i<m; i++){
            for(int j=1; j<n; j++){
                step[i][j] = step[i-1][j] + step[i][j-1];
            }
        }
        return step[m-1][n-1];
    }
}
