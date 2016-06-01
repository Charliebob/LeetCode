/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class BSTIterator {
    private TreeNode current;
    private Stack<TreeNode> stack;
    
    public BSTIterator(TreeNode root) {
        current = root;
        stack = new Stack<TreeNode>();
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return !stack.isEmpty() || current!=null;
    }

    /** @return the next smallest number */
    public int next() {
        while(!stack.isEmpty()||current!=null){
            if(current!=null){
                stack.push(current);
                current = current.left;
            }else{
                current = stack.peek().right;
                break;
            }
        }
        TreeNode node = stack.pop();
        return node.val;
    }
}

/**
 * Your BSTIterator will be called like this:
 * BSTIterator i = new BSTIterator(root);
 * while (i.hasNext()) v[f()] = i.next();
 */