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
    private boolean dfs(TreeNode node,Integer min,Integer max){
        if(node==null){
            return true;
        }
        if((min!= null && node.val<=min)||(max != null && node.val>=max)){
           return false;
        }
        return dfs(node.left,min,node.val) && dfs(node.right,node.val,max);

    }
    public boolean isValidBST(TreeNode root) {
        return dfs(root,null,null);
    }
}