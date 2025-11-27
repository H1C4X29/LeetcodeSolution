package solution.graph.dfs;

/**
 * 695. 岛屿的最大面积

 * 给你一个大小为 m x n 的二进制矩阵 grid 。

 * 岛屿 是由一些相邻的 1 (代表土地) 构成的组合，这里的「相邻」要求两个 1 必须在 水平或者竖直的四个方向上 相邻。你可以假设 grid 的四个边缘都被 0（代表水）包围着。

 * 岛屿的面积是岛上值为 1 的单元格的数目。

 * 计算并返回 grid 中最大的岛屿面积。如果没有岛屿，则返回面积为 0 。
 */
public class Solution695 {
    private static final int[][] DIRS = {{0,1},{0,-1},{1,0},{-1,0}};

    public int maxAreaOfIsland(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int ans = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1){
                    ans = Math.max(ans, dfs(i,j,grid));
                }
            }
        }

        return ans;
    }

    private int dfs(int i,int j,int[][] grid){
        int m = grid.length;
        int n = grid[0].length;
        if (i < 0 || i >= m || j < 0 || j >= n || grid[i][j] == 0){
            return 0;
        }
        int res = 1;
        grid[i][j] = 0;
        for (int[] dir : DIRS) {
            int x = i + dir[0];
            int y = j + dir[1];
            res += dfs(x,y,grid);
        }
        return res;
    }
}
