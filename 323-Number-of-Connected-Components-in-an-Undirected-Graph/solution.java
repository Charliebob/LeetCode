public class Solution {
    public int countComponents(int n, int[][] edges) {
        int[] id = new int[n];
        // 初始化
        for (int i = 0; i < n; i++) {
            id[i] = i;
        }
        // union
        for (int[] edge : edges) {              
            int i = root(id, edge[0]);
            int j = root(id, edge[1]);
            id[i] = j;
        }
        // 统计根节点个数
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (id[i] == i)
                count++;
        }
        return count;
    }
    // 找根节点
    public int root(int[] id, int i) {
        while (i != id[i]) {
            id[i] = id[id[i]];
            i = id[i];
        }
        return i;
    }
}
