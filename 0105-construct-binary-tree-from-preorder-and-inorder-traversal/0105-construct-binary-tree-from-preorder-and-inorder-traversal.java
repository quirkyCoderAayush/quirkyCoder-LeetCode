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
    Map<Integer, Integer> inorderMap = new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for (int i = 0; i < inorder.length; i++) {
            inorderMap.put(inorder[i], i);
        }
        return buildTreeHelper(preorder, inorder, 0, 0, inorder.length - 1);
    }

    private TreeNode buildTreeHelper(int[] preorder, int[] inorder, int preorderIndex, int inorderStart, int inorderEnd) {
        if (inorderStart > inorderEnd) {
            return null;
        }
        int rootVal = preorder[preorderIndex];
        TreeNode root = new TreeNode(rootVal);
        int rootIndex = inorderMap.get(rootVal);
        root.left = buildTreeHelper(preorder, inorder, preorderIndex + 1, inorderStart, rootIndex - 1);
        root.right = buildTreeHelper(preorder, inorder, preorderIndex + (rootIndex - inorderStart + 1), rootIndex + 1, inorderEnd);
        return root;
    }
}