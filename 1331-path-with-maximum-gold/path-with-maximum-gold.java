class Solution {
    public int dfs(int[][] grid, int i, int j, int score) {
        int m = grid.length;
        int n = grid[0].length;
        if (i < 0 || i >= m || j < 0 || j >= n) {
            return score;
        }
        if (grid[i][j] == 0) {
            return score;
        }
        int original_val= grid[i][j];
        score += grid[i][j];
        grid[i][j]=0;
        int max_score=score;
        max_score= Math.max(dfs(grid, i+1, j, score),max_score);
    
        max_score= Math.max(dfs(grid, i-1, j, score),max_score);
    
        max_score= Math.max(dfs(grid, i, j+1, score),max_score);
    
        max_score= Math.max(dfs(grid, i, j-1, score),max_score);
        grid[i][j]=original_val;
        return max_score;
    }

    public int getMaximumGold(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int max_score = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] != 0) {
                    max_score = Math.max(dfs(grid, i, j, 0), max_score);
                }
            }
        }
        return max_score;
    }
}