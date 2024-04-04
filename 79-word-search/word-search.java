



class Solution {
    boolean result = false;

    private boolean inBoundires(int m, int n, int i, int j) {
        if (i >= 0 && i < m && j >= 0 && j < n) {
            return true;
        }
        return false;
    }

    private boolean dfs(char[][] board, String word, int index, int i, int j) {
        int m = board.length;
        int n = board[0].length;
        if (index == word.length()) {
            return true;
        }
        if (!inBoundires(m, n, i, j) || board[i][j] != word.charAt(index)) {
            return false;
        }
        board[i][j] = ' ';
        boolean result = dfs(board, word, index + 1, i + 1, j) ||
                dfs(board, word, index + 1, i - 1, j) ||
                dfs(board, word, index + 1, i, j + 1) ||
                dfs(board, word, index + 1, i, j - 1);
        board[i][j] = word.charAt(index);
        return result;
    }

    public boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (dfs(board, word, 0, i, j))
                    return true;
            }
        }
        return false;
    }
}



    


    
    
    

    
    

    
        
    

    
        
        
        
    


    
    

    
        
        
    

    
        
        
    

    
        
    

    
        
    

    
        
    

    
        
    

    
        
        
    

  

    
        
    

    

    
        
    
            
                
                