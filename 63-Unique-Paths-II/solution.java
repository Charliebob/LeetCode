public class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int row = obstacleGrid.length;
        int col = obstacleGrid[0].length;
        int[][] dp = new int[row][col];
        for(int i=0; i<row; i++){
            if(obstacleGrid[i][0]==1){
                for(int j=i; j<row; j++) dp[j][0] = 0;
                break;
            }else{
                dp[i][0] = 1;
            }
        }
        for(int i=0; i<col; i++){
            if(obstacleGrid[0][i]==1){
                for(int j=i; j<col; j++) dp[0][j] = 0;
                break;
            }else{
                dp[0][i] = 1;
            }
        }
        for(int i=1; i<row; i++){
            for(int j=1; j<col; j++){
                if(obstacle[i][j]==1){
                    for(int k=i; k<row; k++) dp[k][j] = 0;
                    for(int l=j; j<col; l++) dp[i][l] = 0;
                }else{
                    dp[i][j] = dp[i-1][j]+dp[i][j-1];
                }
            }
        }
        return dp[row-1][col-1];
    }
}
