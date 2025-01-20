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
    private void preOrderHelper(TreeNode root, List<Integer> result) {
        if(root == null) return;

        result.add(root.val);
        preOrderHelper(root.left, result);
        preOrderHelper(root.right, result);
    }
    public List<Integer> preorderTraversal(TreeNode root) {

        List<Integer> result = new ArrayList<>();
        preOrderHelper(root, result);
        return result;
        
    }
}