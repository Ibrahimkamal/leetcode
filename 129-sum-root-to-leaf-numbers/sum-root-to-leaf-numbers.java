/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int sum=0;
    void dfs(TreeNode node, int val){
        if(node!=null){
            val=val*10+node.val;
            if (node.left==null && node.right==null)
                sum+=val;
        
            dfs(node.left,val);
            dfs(node.right,val);
        }
    
    }
    public int sumNumbers(TreeNode root) {
        dfs(root,0);
        return sum;
    }
}