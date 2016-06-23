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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        if(root==null) return result;
        queue.add(root);
        while(!queue.isEmpty()){
            int level = queue.size();
            List<Integer> eachLevel = new ArrayList<Integer>();
            while(level-->0){
                if(queue.peek().left!=null){
                    queue.add(queue.peek().left);
                }
                if(queue.peek().right!=null){
                    queue.add(queue.peek().right);
                }
                eachLevel.add(queue.poll().val);
            }
            result.add(0,eachLevel);
        }
        return result;
    }
}