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
    public List<List<Integer>> findLeaves(TreeNode root) {
        List<List<Integer>> results = new ArrayList<List<Integer>>();
        if (root == null) return results;
        while (root != null)
        {
            List<Integer> leaves = new ArrayList<Integer>();
            root = removeLeaves(root, leaves);
            results.add(leaves);
        }
        return results;
        
    }
    private TreeNode removeLeaves(TreeNode root, List<Integer> result)
    {
        if (root == null) return null;
        if (root.left == null && root.right == null)
        {
            result.add(root.val);
            return null;
        }
        
        root.left = removeLeaves(root.left, result);
        root.right = removeLeaves(root.right, result);
        return root;
    }
}
