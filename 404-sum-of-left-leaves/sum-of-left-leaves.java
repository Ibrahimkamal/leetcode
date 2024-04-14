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
    public int sumOfLeftLeaves(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        int sum=0;
        stack.add(root);
        while(!stack.isEmpty()){
            TreeNode node=stack.pop();
            if(node==null) continue;

            if(node.left!=null){
                if(node.left.left==null && node.left.right==null){
                    sum+=node.left.val;
                }
                stack.add(node.left);
            }
            if(node.right!=null){
                stack.add(node.right);
            }
        }
        return sum;
    }
}