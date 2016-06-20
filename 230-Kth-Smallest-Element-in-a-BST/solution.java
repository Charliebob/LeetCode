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
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        inorderTraversal(root, res, k);
        return res.get(k-1);
    }
    private void inorderTraversal(TreeNode root, ArrayList<Integer>res, int k){
        if(res.size()>=k) return;
        if(root.left!=null) inorderTraversal(root.left, res, k);
        res.add(root.val);
        if(root.right!=null)inorderTraversal(root.right, res, k);
    }
    
}