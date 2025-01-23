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

        List<List<Integer>> result = new ArrayList<>();
       if(root == null) return result;

       TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map = new TreeMap<>();
       
       dfs(root, map, 0, 0);
       
       for(Map.Entry<Integer, TreeMap<Integer, PriorityQueue<Integer>>> entry : map.entrySet()) {
           TreeMap<Integer, PriorityQueue<Integer>> levelMap = entry.getValue();
           ArrayList<Integer> colList = new ArrayList<>();
           
           for(PriorityQueue<Integer> nodes : levelMap.values()) {
               while(!nodes.isEmpty()) {
                   colList.add(nodes.poll());
               }
           }
           result.add(colList);
       }
       return result;
   }
   
   private void dfs(TreeNode node, TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map, int col, int level) {
       if(node == null) return;
       
       map.putIfAbsent(col, new TreeMap<>());
       map.get(col).putIfAbsent(level, new PriorityQueue<>());
       map.get(col).get(level).offer(node.val);
       
       dfs(node.left, map, col-1, level+1);
       dfs(node.right, map, col+1, level+1);
   }
}