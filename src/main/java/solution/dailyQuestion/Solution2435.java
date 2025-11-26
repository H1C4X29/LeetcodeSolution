package solution.dailyQuestion;

import java.util.Arrays;

/**
 * 2435. 矩阵中和能被 K 整除的路径

 * 给你一个下标从 0 开始的 m x n 整数矩阵 grid 和一个整数 k 。你从起点 (0, 0) 出发，每一步只能往 下 或者往 右 ，你想要到达终点 (m - 1, n - 1) 。
 *
 * 请你返回路径和能被 k 整除的路径数目，由于答案可能很大，返回答案对 109 + 7 取余 的结果。
 */
public class Solution2435 {
    private static final int MOD = 1_000_000_000 + 7;

    public int numberOfPaths(int[][] grid, int k){
        int m = grid.length;
        int n = grid[0].length;
        int[][][] memo = new int[m][n][k];
        for(int[][] matrix:memo){
            for(int[] row:matrix){
                Arrays.fill(row,-1);
            }
        }
        return dfs(m-1,n-1,0,memo,grid,k);
    }

    private int dfs(int i,int j,int s,int[][][] memo,int[][] grid,int k){
        //递归边界
        if (i < 0 || j < 0){
            return 0;
        }
        if (memo[i][j][s] != -1){
            return memo[i][j][s];
        }
        int preS = ((s - grid[i][j])% k + k) % k;
        if (i == 0 && j == 0){
            return preS == 0 ? 1 : 0;
        }

        return memo[i][j][s] = (dfs(i-1, j, preS, memo, grid, k) + dfs(i,j-1,preS, memo, grid, k))% MOD;
    }
}
