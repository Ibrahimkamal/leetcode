class Solution {
    private int getscore(int [][] grid, int i, int j, int m , int n){
        int count=4;
        if(i-1>=0 && i-1<m){
            count-= grid[i-1][j];
        }
        if(j-1>=0 && j-1<n){
            count-= grid[i][j-1];
        }
        if(i+1>=0 && i+1<m){
            count-= grid[i+1][j];
        }
        if(j+1>=0 && j+1<n){
            count-= grid[i][j+1];
        }
        return count;
    }

    public int islandPerimeter(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int val=0;
        for(int i=0;i<m;i++){
            for( int j=0;j<n;j++){
                if(grid[i][j]==0) continue;
                val+=getscore(grid,i,j,m,n);
            }
        }
        return val;
    }
}



    


    
    
    

    
    

    
        
    

    
        
        
        
    


    
    

    
        
        
    

    
        
        
    

    
        
    

    
        
    

    
        
    

    
        
    

    
        
        
    

  

    
        
    

    

    
        
    
            
                
                