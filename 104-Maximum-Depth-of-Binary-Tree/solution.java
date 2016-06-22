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
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        Queue<TreeNode> stack = new LinkedList<TreeNode>();
        stack.add(root);
        int count = 0;
        while(!stack.isEmpty()){
            int size = stack.size();
            while(size-->0){
                TreeNode cur = stack.poll();
                if(cur.left!=null){
                    stack.add(cur.left);
                }
                if(cur.right!=null){
                    stack.add(cur.right);
                }
            }
            count++;
        }
        return count;
    }
}
