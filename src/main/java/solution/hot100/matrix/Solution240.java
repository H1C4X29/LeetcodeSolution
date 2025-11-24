package solution.hot100.matrix;

/**
 * 240. 搜索二维矩阵 II

 * 编写一个高效的算法来搜索 m x n 矩阵 matrix 中的一个目标值 target 。该矩阵具有以下特性：

 * 每行的元素从左到右升序排列。
 * 每列的元素从上到下升序排列。
 */
public class Solution240 {
    /**
     * 因为矩阵每行每列都是单调的，因此从右上角历遍元素可以一次删除一行或者是一列，整体复杂度为O(m+n)
     * 如果当前元素matrix[i][j] == target，说明找到了目标元素直接返回即可
     * 如果当前元素matrix[i][j] <  target,说明这一行左边的所有元素均不是目标元素，往下方搜索
     * 如果当前元素matrix[i][j] >  target，说明这一列右边所有元素均不是目标元素，往左边搜索
     * 边界条件是i j在整个矩阵的范围内，任意一边跳出矩阵说明未找到元素，直接返回false
     * @param matrix
     * @param target
     * @return
     */
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int i = 0;
        int j = n - 1;
        while (i < m && j>=0){
            if (matrix[i][j] == target){
                return true;
            }
            else if (matrix[i][j] < target){
                i++;
            }
            else{
                j--;
            }
        }
        return false;
    }
}
