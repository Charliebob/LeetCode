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
        ArrayList<Integer> result = new ArrayList<Integer>();
        inOrderTraversal(root, result, k);
        return result.get(k-1);
    }
    private void inOrderTraversal(TreeNode root, ArrayList<Integer>result, int k){
        if(result.size()>=k) return;
        if(root.left!=null) inOrderTraversal(root.left, result, k);
        result.add(root.val);
        if(root.right!=null) inOrderTraversal(root.right, result, k);
    }
}