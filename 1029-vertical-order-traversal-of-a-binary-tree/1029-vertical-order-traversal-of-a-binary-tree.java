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

        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map = new TreeMap<>();
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(0, 0, root));

        while (!q.isEmpty()) {
            Pair curr = q.poll();
            int hd = curr.hd;
            int row = curr.row;

            map.putIfAbsent(hd, new TreeMap<>());
            map.get(hd).putIfAbsent(row, new PriorityQueue<>());
            map.get(hd).get(row).add(curr.node.val);

            if (curr.node.left != null) {
                q.add(new Pair(hd - 1, row + 1, curr.node.left));
            }
            if (curr.node.right != null) {
                q.add(new Pair(hd + 1, row + 1, curr.node.right));
            }
        }

        List<List<Integer>> result = new ArrayList<>();
        for (TreeMap<Integer, PriorityQueue<Integer>> rows : map.values()) {
            List<Integer> vertical = new ArrayList<>();
            for (PriorityQueue<Integer> nodes : rows.values()) {
                while (!nodes.isEmpty()) {
                    vertical.add(nodes.poll());
                }
            }
            result.add(vertical);
        }
        return result;
    }

    static class Pair {
        int hd;
        int row;
        TreeNode node;

        public Pair(int hd, int row, TreeNode node) {
            this.hd = hd;
            this.row = row;
            this.node = node;
        }
    }
}