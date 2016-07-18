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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new LinkedList<String>();
        if(root==null) return result;
        String path = "" + root.val;
        helper(root, result, path);
        return result;
    }
    public void helper(TreeNode root, List<String> result, String path){
        if(root.left==null && root.right == null) result.add(path);
        else{
            if(root.left!=null) helper(root.left, result, path+"->"+root.left.val);
            if(root.right!=null) helper(root.right, result, path+"->"+root.right.val);
        }
    }
    
}
