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
    public List<List<Integer>> levelOrder(TreeNode root) {
        ArrayDeque<TreeNode> q=new ArrayDeque<>();
        List<List<Integer>> result=new ArrayList<>();

        if(root==null)
            return result;
        q.add(root);
        while(!q.isEmpty()){
            ArrayList<Integer> tempresult=new ArrayList<>();
            ArrayDeque<TreeNode> temp=new ArrayDeque<>();
            while(!q.isEmpty()){
        
                TreeNode node=q.pop();
                tempresult.add(node.val);
                if(node.left!=null)temp.add(node.left);;

                
                if(node.right!=null)temp.add(node.right);;
            }
            result.add(tempresult);
            q=temp;
        }
        return result;
    }
}