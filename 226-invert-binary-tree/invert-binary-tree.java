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
    public void help(TreeNode root)
    {
        if(root==null) return;
        help(root.left);
        help(root.right);
        TreeNode temp=root.left;
        root.left=root.right;
        root.right=temp;
    }
    public TreeNode invertTree(TreeNode root) {
        help(root);
        return root;
    }
}