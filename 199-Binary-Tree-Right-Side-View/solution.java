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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        helper(root, 1, result);
        return result;
    }
    public void helper(TreeNode root, int depth, List<Integer>result){
        if(root==null) return;
        if(result.size()<depth) result.add(root.val);
        helper(root.right, depth+1, result);
        helper(root.left, depth+1, result);
    }
}