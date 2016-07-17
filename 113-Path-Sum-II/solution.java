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
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> res=new ArrayList<List<Integer>>();
        helper(res,new ArrayList<Integer>(),root,sum);
        return res;
    }
    public void helper(List<List<Integer>> res,List<Integer> temp,TreeNode root,int sum){
        if(root==null)return;
        temp.add(root.val);
        if(root.left==null&&root.right==null&&sum-root.val==0)
            res.add(temp);
        else{
             helper(res,new ArrayList<Integer>(temp),root.left,sum-root.val);
             helper(res,new ArrayList<Integer>(temp),root.right,sum-root.val);
        }

    
    }
}