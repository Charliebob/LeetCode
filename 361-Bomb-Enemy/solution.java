public class Solution {
    public int maxKilledEnemies(char[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }
        int ret = 0;
        int row = grid.length;
        int col = grid[0].length;
        int rowCache = 0;
        int[] colCache = new int[col];
        for (int i = 0;i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (j == 0 || grid[i][j-1] == 'W') {
                    rowCache = 0;
                    for (int k = j; k < col && grid[i][k] != 'W'; k++) {
                        rowCache += grid[i][k] == 'E' ? 1 : 0;
                    }
                }
                if (i == 0 || grid[i-1][j] == 'W') {
                    colCache[j] = 0;
                    for (int k = i;k < row && grid[k][j] != 'W'; k++) {
                        colCache[j] += grid[k][j] == 'E' ? 1 :0;
                    }
                }
                if (grid[i][j] == '0') {
                    ret = Math.max(ret, rowCache + colCache[j]);
                }
            }
        }
        return ret;
    }
}

