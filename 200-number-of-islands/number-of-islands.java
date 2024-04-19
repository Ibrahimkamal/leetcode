class Solution {
    private char[][] grid;
    private void dfs(int i, int j, int m, int n){
        if(i<0 || i>=m ||j<0 || j>=n) return;
        if(grid[i][j]=='0') return;
        grid[i][j]='0';
        dfs(i+1,j,m,n);
        dfs(i,j+1,m,n);
        dfs(i-1,j,m,n);
        dfs(i,j-1,m,n);
    }
    public int numIslands(char[][] grid) {
        this.grid=grid;
        int count=0;
        int m=grid.length;
        int n=grid[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='0')
                    continue;
                count++;
                dfs(i,j,m,n);
            }
        }
        return count;

    }
}