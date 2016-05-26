public class Solution {
    public void wallsAndGates(int[][] rooms) {
        for(int i = 0; i < rooms.length; i++) {
        for(int j = 0; j < rooms[0].length; j++) {
            if(rooms[i][j] == 0) dfs(rooms, i, j, 0);
        }
    }
}

    public void dfs(int[][] rooms, int i, int j, int g) {
        //if rooms[i][j] distance is smaller than previous
        if(i < 0 || i >= rooms.length || j < 0 || j >= rooms[0].length || rooms[i][j] < g) return;
        rooms[i][j] = g;
        dfs(rooms, i - 1, j, g + 1);
        dfs(rooms, i, j - 1, g + 1);
        dfs(rooms, i + 1, j, g + 1);
        dfs(rooms, i, j + 1, g + 1);
    }
}