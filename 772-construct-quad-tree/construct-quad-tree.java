/*
// Definition for a QuadTree node.
class Node {
    public boolean val;
    public boolean isLeaf;
    public Node topLeft;
    public Node topRight;
    public Node bottomLeft;
    public Node bottomRight;

    
    public Node() {
        this.val = false;
        this.isLeaf = false;
        this.topLeft = null;
        this.topRight = null;
        this.bottomLeft = null;
        this.bottomRight = null;
    }
    
    public Node(boolean val, boolean isLeaf) {
        this.val = val;
        this.isLeaf = isLeaf;
        this.topLeft = null;
        this.topRight = null;
        this.bottomLeft = null;
        this.bottomRight = null;
    }
    
    public Node(boolean val, boolean isLeaf, Node topLeft, Node topRight, Node bottomLeft, Node bottomRight) {
        this.val = val;
        this.isLeaf = isLeaf;
        this.topLeft = topLeft;
        this.topRight = topRight;
        this.bottomLeft = bottomLeft;
        this.bottomRight = bottomRight;
    }
}
*/

class Solution {
    int[][] grid;
    private Node helper(int start_row,int start_col,int end_row,int end_col){
        int val=this.grid[start_row][start_col];
        for(int i=start_row;i<end_row;i++){
            for(int j=start_col;j<end_col;j++){
                if(this.grid[i][j]!=val){
                    int mid_row = start_row + (end_row - start_row) / 2;
                    int mid_col = start_col + (end_col - start_col) / 2;
                    
                    Node new_node = new Node(false, false);
                    new_node.topLeft = helper(start_row, start_col, mid_row, mid_col);
                    new_node.topRight = helper(start_row, mid_col, mid_row, end_col);
                    new_node.bottomLeft = helper(mid_row, start_col, end_row, mid_col);
                    new_node.bottomRight = helper(mid_row, mid_col, end_row, end_col);
                    
                    return new_node;
                }
            }
        }
        return new Node(val==1,true);
    }
    public Node construct(int[][] grid) {
        this.grid=grid;
        return helper(0, 0, grid.length, grid.length);
    }
}