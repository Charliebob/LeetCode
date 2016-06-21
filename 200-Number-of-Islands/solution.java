public class Solution {
    public int numIslands(char[][] grid) {
        if(grid==null) return 0;
        int result = 0;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                    result++;
                    DFS(grid,i,j);
                }
            }
        }
        return result;
    }
    
    private void DFS(char[][] grid, int i, int j){
        if(i<0||i>=grid.length||j<0||j>=grid[0].length||grid[i][j]!='1') return;
        grid[i][j]='0';
        DFS(grid, i-1, j);
        DFS(grid, i+1, j);
        DFS(grid, i, j-1);
        DFS(grid, i, j+1);
    }
    
}