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
    public void help(TreeNode root, String str, List<String> list)
    {
        if(root.left==null && root.right==null)
        {
            str+=Integer.toString(root.val);
            list.add(str);
            return;
        }
        str+=Integer.toString(root.val)+"->";
        if(root.left!=null) help(root.left, str, list);
        if(root.right!=null) help(root.right, str, list);
        return;
    }
    public List<String> binaryTreePaths(TreeNode root) {
        ArrayList<String> list=new ArrayList<>();
        help(root, "", list);
        return list;
    }
}