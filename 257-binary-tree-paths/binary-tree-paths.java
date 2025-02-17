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
    static ArrayList<String> list=new ArrayList<>();
    public void help(TreeNode root, String str)
    {
        if(root.left==null && root.right==null)
        {
            str+=Integer.toString(root.val);
            list.add(str);
            return;
        }
        str+=Integer.toString(root.val)+"->";
        if(root.left!=null) help(root.left, str);
        if(root.right!=null) help(root.right, str);
        return;
    }
    public List<String> binaryTreePaths(TreeNode root) {
        list.clear();
        help(root, "");
        return list;
    }
}