class Solution {
    private boolean inRange(int i, int j, int m,int n){
        if(i<m && i>=0 && j<n && j>=0){
            return true;
        }
        return false;
    }
    public int numIslands(char[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int islands=0;
        Stack<int[]> stack=new Stack<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='0')
                    continue;
                islands++;
                stack.push(new int[]{i,j});
                while(!stack.isEmpty()){
                    int [] point=stack.pop();
                    int r=point[0];
                    int c=point[1];

                    grid[r][c]='0';
                    if(inRange(r+1,c,m,n) && grid[r+1][c]=='1'){
                        stack.push(new int[]{r+1,c});
                    }
                    if(inRange(r-1,c,m,n) && grid[r-1][c]=='1'){
                        stack.push(new int[]{r-1,c});
                    }
                    if(inRange(r,c+1,m,n) && grid[r][c+1]=='1'){
                        stack.push(new int[]{r,c+1});
                    }
                    if(inRange(r,c-1,m,n) && grid[r][c-1]=='1'){
                        stack.push(new int[]{r,c-1});
                    }
                }
            }
        }
        return islands;
    }
}