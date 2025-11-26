package solution.hot100.graph;

import sun.util.resources.cldr.nus.CalendarData_nus_SD;

import java.util.ArrayList;
import java.util.List;

/**
 * 994. 腐烂的橘子

 * 在给定的 m x n 网格 grid 中，每个单元格可以有以下三个值之一：

 * 值 0 代表空单元格；
 * 值 1 代表新鲜橘子；
 * 值 2 代表腐烂的橘子。
 * 每分钟，腐烂的橘子 周围 4 个方向上相邻 的新鲜橘子都会腐烂。

 * 返回 直到单元格中没有新鲜橘子为止所必须经过的最小分钟数。如果不可能，返回 -1 。
 */
public class Solution994 {
    private static final int[][] DIREACTION = {{-1,0},{1,0},{0,1},{0,-1}};

    public int orangesRotting(int[][] grid){
        int m = grid.length;
        int n = grid[0].length;
        int fresh = 0;
        List<int[]> q = new ArrayList<>();
        for (int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if (grid[i][j] == 1){
                    fresh++;
                }else if (grid[i][j] == 2){
                    q.add(new int[]{i,j});
                }
            }
        }
        int ans =0;
        while( fresh > 0 && !q.isEmpty()){
            ans++;
            List<int[]> tmp = q;
            q = new ArrayList<>();
            for (int[] p : tmp){
                for (int[] d:DIREACTION){
                    int i = p[0]+d[0];
                    int j = p[1]+d[1];
                    if (i>=0 && i<m && j>=0 && j<n && grid[i][j] == 1){
                        fresh--;
                        q.add(new int[]{i,j});
                        grid[i][j] = 2;
                    }
                }
            }
        }

        return fresh > 0 ? -1 : ans;
    }
}
