# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def dfs(self, node, depth):
        if not node:
            return depth
        left_depth = self.dfs(node.left, depth + 1)
        right_depth = self.dfs(node.right, depth + 1)
        max_depth = max(left_depth, right_depth)
        return max_depth

    def maxDepth(self, root: Optional[TreeNode]) -> int:
        return self.dfs(root, 0)
