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
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        else{
            if(Math.abs(depth(root.left)-depth(root.right))>1) return false;
            else return isBalanced(root.left)&&isBalanced(root.right);
        }
        
    }
    public int depth(TreeNode node){
        if(node==null) return 0;
        return Math.max(depth(node.left), depth(node.right)) + 1;
    }
}