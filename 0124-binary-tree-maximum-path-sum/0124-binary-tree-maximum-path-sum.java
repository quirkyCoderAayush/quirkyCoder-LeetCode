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
    public int maxPathSum(TreeNode root) {
        int[] maxSum = new int[]{Integer.MIN_VALUE};
        calculateMaxPath(root, maxSum);
        return maxSum[0];

    }
    private int calculateMaxPath(TreeNode node, int[] maxSum) {
        if(node == null) return 0;

        int left = Math.max(0, calculateMaxPath(node.left, maxSum));
        int right = Math.max(0, calculateMaxPath(node.right, maxSum));

        maxSum[0] = Math.max(maxSum[0], left+right+node.val);

        return node.val + Math.max(left, right);
    }
}