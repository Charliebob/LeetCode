/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {
    private static final String splitter = ",";
    private static final String Non = "X";
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        buildString(root, sb);
        return sb.toString();
        
    }
    public void buildString(TreeNode node, StringBuilder sb){
        if(node==null){
            sb.append(Non).append(splitter);
        }else{
            sb.append(node.val).append(splitter);
            buildString(node.left, sb);
            buildString(node.right, sb);
        }
    }
    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        Queue<String> nodes = new LinkedList<>();
        nodes.addAll(Arrays.asList(data.split(splitter)));
        return buildTree(nodes);
    }
    private TreeNode buildTree(Queue<String> nodes){
        String value = nodes.remove();
        if(value.equals(Non)) return null;
        else{
            TreeNode node = new TreeNode(Integer.valueOf(value));
            node.left = buildTree(nodes);
            node.right = buildTree(nodes);
            return node;
        }
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.deserialize(codec.serialize(root));
