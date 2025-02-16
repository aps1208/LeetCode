/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean help(TreeNode root, int sum,int targetSum)
    {
        sum=sum+root.val;
        if(root.left==null && root.right==null && sum==targetSum) return true;
        if(root.left==null && root.right==null && sum!=targetSum) return false;
        boolean flag1=false,flag2=false;
        if(root.left!=null) flag1=help(root.left,sum,targetSum);
        if(root.right!=null) flag2=help(root.right,sum,targetSum);
        return (flag1 || flag2);
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null) return false;
        return help(root,0,targetSum);
    }
}