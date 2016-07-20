/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        travel(root, result,0);
        return result;
    }
    public void travel(TreeNode cur, List<List<Integer>> result, int level){
        if(cur==null) return;
        if(result.size()<=level){
            List<Integer> item = new LinkedList<>();
            result.add(item);
        }
        List<Integer> collection = result.get(level);
        if(level%2==0) collection.add(cur.val);
        else collection.add(0,cur.val);
        travel(cur.left, result, level+1);
        travel(cur.right, result, level+1);
    }
}
