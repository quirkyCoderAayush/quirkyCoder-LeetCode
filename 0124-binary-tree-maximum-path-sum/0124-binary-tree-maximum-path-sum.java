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
    private int maxSum = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        
        calculateMaxPath(root);
        return maxSum;

    }
    private int calculateMaxPath(TreeNode node) {
        if(node == null) return 0;

        int left = Math.max(0, calculateMaxPath(node.left));
        int right = Math.max(0, calculateMaxPath(node.right));

        maxSum = Math.max(maxSum, left+right+node.val);

        return node.val + Math.max(left, right);
    }
}