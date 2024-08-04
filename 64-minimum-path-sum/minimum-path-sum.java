class Solution {
    Integer[][]memo;
    int[][] grid;
    int m;
    int n;
    private int dp(int i,int j){
        int down=Integer.MAX_VALUE;
        int right=Integer.MAX_VALUE;
        if(i==m-1 && j==n-1)
            return grid[i][j];
        if(memo[i][j]!=null)
            return memo[i][j];
        if(j<n-1)
            right=dp(i, j+1);
        if(i<m-1)
            down=dp(i+1, j);
        
        int result=Math.min(down,right)+grid[i][j];
        memo[i][j]=result;
        return memo[i][j];

    }
    public int minPathSum(int[][] grid) {
        this.m=grid.length;
        this.n=grid[0].length;
        this.memo=new Integer[m][n];
        this.grid=grid;
        return dp(0,0);
    }
}