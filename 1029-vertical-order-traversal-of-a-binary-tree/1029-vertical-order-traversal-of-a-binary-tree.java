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
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        TreeMap<Integer, List<int[]>> columnMap = new TreeMap<>();
        Queue<TreeNodeInfo> queue = new LinkedList<>();
        queue.offer(new TreeNodeInfo(root, 0, 0));
        
        while (!queue.isEmpty()) {
            TreeNodeInfo info = queue.poll();
            columnMap.putIfAbsent(info.column, new ArrayList<>());
            columnMap.get(info.column).add(new int[] { info.row, info.node.val });
            
            if (info.node.left != null) 
                queue.offer(new TreeNodeInfo(info.node.left, info.column - 1, info.row + 1));
            if (info.node.right != null) 
                queue.offer(new TreeNodeInfo(info.node.right, info.column + 1, info.row + 1));
        }
        
        List<List<Integer>> result = new ArrayList<>();
        for (List<int[]> nodes : columnMap.values()) {
            nodes.sort((a, b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);
            List<Integer> columnList = new ArrayList<>();
            for (int[] node : nodes) columnList.add(node[1]);
            result.add(columnList);
        }
        
        return result;
    }

    private static class TreeNodeInfo {
        TreeNode node;
        int column;
        int row;

        TreeNodeInfo(TreeNode node, int column, int row) {
            this.node = node;
            this.column = column;
            this.row = row;
        }
    }
}    
    