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
    public int help(TreeNode root, int result, int num)
    {
        num=num*10+root.val;
        if(root.left!=null) result+=help(root.left,0,num);
        if(root.right!=null) result+=help(root.right,0,num);
        if(root.left==null && root.right==null) result= num;
        return result;
    }
    public int sumNumbers(TreeNode root) {
        return help(root,0,0);
    }
}