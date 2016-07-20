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
        while(hasNext()){
            while(current!=null){
                stack.push(current);
                current = current.left;
            }
            current = stack.peek().right;
            break;
            
        }
        TreeNode node = stack.pop();
        return node.val;
    }
}


// while(cur!=null){
//                 stack.add(cur);
//                 cur = cur.left;
//             }
//             cur = stack.pop();
//             result.add(cur.val);
//             cur = cur.right;
/**
 * Your BSTIterator will be called like this:
 * BSTIterator i = new BSTIterator(root);
 * while (i.hasNext()) v[f()] = i.next();
 */