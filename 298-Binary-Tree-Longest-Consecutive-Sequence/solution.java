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
    private int maxLength=0;
    public int longestConsecutive(TreeNode root) {
        DFS(root, null, 0);
        return maxLength;
    }
    private void DFS(TreeNode cur, TreeNode parent, int length){
        if(root==null) return;
        length = (parent!=null && cur.val+1=parent)? length+1: 1;
        maxLength = Math.max(length, maxLength);
        DFS(parent.left, parent, length);
        DFS(parent.right, parent, length);
    }
}