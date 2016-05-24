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
    List<Integer> result = new ArrayList<Integer>();
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root==null) return result;
        result.add(root.val);
        preorderTraversal(root.left);
        return preorderTraversal(root.right);
    }
}