class Solution {
    public int matrixScore(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;

        for(int i=0;i<m;i++){
            if(grid[i][0]==0){
                for(int j=0;j<n;j++){
                    grid[i][j]=1-grid[i][j];
                }
            }
        }

        for(int i=1;i<n;i++){
            int columnOnes=0;
            for(int j=0;j<m;j++){
                if(grid[j][i]==1){
                    columnOnes++;
                }
            }
            if(columnOnes<m-columnOnes){
                for(int j=0;j<m;j++){
                    grid[j][i]=1-grid[j][i];
                }
            }
        }
        int result=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int val=grid[i][j]<<(n-j-1);
                result+=val;
            }
        }
        return result;
    }
}