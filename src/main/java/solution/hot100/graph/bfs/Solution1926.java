package solution.hot100.graph.bfs;

import java.util.ArrayList;
import java.util.List;

/**
 1926. 迷宫中离入口最近的出口

 给你一个 m x n 的迷宫矩阵 maze （下标从 0 开始），矩阵中有空格子（用 '.' 表示）和墙（用 '+' 表示）。同时给你迷宫的入口 entrance ，用 entrance = [entrancerow, entrancecol] 表示你一开始所在格子的行和列。

 每一步操作，你可以往 上，下，左 或者 右 移动一个格子。你不能进入墙所在的格子，你也不能离开迷宫。你的目标是找到离 entrance 最近 的出口。出口 的含义是 maze 边界 上的 空格子。entrance 格子 不算 出口。

 请你返回从 entrance 到最近出口的最短路径的 步数 ，如果不存在这样的路径，请你返回 -1 。
 */
public class Solution1926 {
    private static final int[][] DIRS = {{0,1},{0,-1},{1,0},{-1,0}};

    public int nearestExit(char[][] maze, int[] entrance) {
        int m = maze.length;
        int n = maze[0].length;
        boolean[][] vis = new boolean[m][n];
        vis[entrance[0]][entrance[1]] = true;
        List<int[]> q = new ArrayList<>();
        q.add(new int[]{entrance[0],entrance[1]});

        for (int ans = 1;!q.isEmpty();ans++){
            List<int[]> tmp = q;
            q = new ArrayList<>();
            for (int[] p:tmp){
                for (int[] d:DIRS){
                    int x = p[0] + d[0];
                    int y = p[1] + d[1];
                    if (0 <= x && x< m && 0<= y && y < n &&maze[x][y] == '.' && !vis[x][y]){
                        vis[x][y] = true;
                        q.add(new int[]{x,y});

                        if (x == 0 || y == 0 || x == m-1 || y == n -1){
                            return ans;
                        }
                    }
                }
            }
        }
        return -1;
    }
}
