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
    int [] nums;
    private TreeNode helper(int left,int right){
        if(left>right)
            return null;
        int p=(right+left)/2;
        TreeNode node=new TreeNode(this.nums[p]);
        node.left=helper(left, p-1);
        node.right=helper(p+1,right);
        return node;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        this.nums=nums;
        return helper(0, nums.length-1);
    }
}