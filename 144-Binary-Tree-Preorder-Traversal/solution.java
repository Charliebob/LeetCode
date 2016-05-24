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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        while(root!=null){
            result.add(root.val);
            if(root.right!=null) stack.push(root.right);
            root = root.left;
            if(root.left==null && !stack.isEmpty()) stack.pop();
        }
        return result;
    }
}