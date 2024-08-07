class Solution {
    Integer[][] memo;
    int[][] obstacleGrid;
    int m;
    int n;

    int dp(int i, int j) {
        if (i >= m || j >= n || this.obstacleGrid[i][j] == 1)
            return 0;
        // Integer[][] test = this.memo;
        if (i == m - 1 && j == n - 1) {
            return 1;
        }

        if (memo[i][j] != null) {
            return memo[i][j];
        }
        int result = dp(i + 1, j) + dp(i, j + 1);
        this.memo[i][j] = result;
        return result;
    }

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        this.m = obstacleGrid.length;
        this.n = obstacleGrid[0].length;
        this.obstacleGrid = obstacleGrid;
        this.memo = new Integer[m][n];

        return dp(0, 0);
    }
}