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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        ArrayDeque<TreeNode> q=new ArrayDeque<>();
        ArrayList<List<Integer>> result=new ArrayList<>();
        if( root==null)
            return result;
        q.add(root);
        while(!q.isEmpty()){
            int level_length=q.size();
            ArrayList<Integer> local_result=new ArrayList<>();
            for(int i=0;i<level_length;i++){
                TreeNode node=q.poll();
                if(node.left!=null)q.add(node.left);
                if(node.right!=null)q.add(node.right);
                local_result.add(node.val);
            }
            if(result.size()%2==1){
                Collections.reverse(local_result);
            }
            result.add(local_result);
        }
        return result;
    }
}