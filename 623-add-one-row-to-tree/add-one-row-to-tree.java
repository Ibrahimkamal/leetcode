
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        ArrayDeque<Pair<TreeNode, Integer>> q = new ArrayDeque<>();
        if(depth==1){
            TreeNode newLeftNode = new TreeNode(val, root, null);
            return newLeftNode;
        }
        q.add(new Pair<TreeNode, Integer>(root, 1));
        
        while (!q.isEmpty()) {
            Pair<TreeNode, Integer> current = q.poll();
            TreeNode node = current.getKey();
            int level = current.getValue();
            if (node == null) {
                continue;
            }
            if (level == depth - 1) {
                TreeNode newLeftNode = new TreeNode(val, node.left, null);
                TreeNode newRightNode = new TreeNode(val, null, node.right);
                node.left = newLeftNode;
                node.right = newRightNode;
                continue;
            } else {
                q.add(new Pair<TreeNode, Integer>(node.left, level + 1));
                q.add(new Pair<TreeNode, Integer>(node.right, level + 1));
            }

        }
        return root;

    }
}
