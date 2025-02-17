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
    public void help(TreeNode root, StringBuilder str, List<String> list)
    {
        int len=str.length();
        str.append(root.val);
        str.append("->");
        if(root.left==null && root.right==null)
        {
            str.setLength(str.length()-2);
            list.add(str.toString());
        }
        if(root.left!=null) help(root.left, str, list);
        if(root.right!=null) help(root.right, str, list);
        str.setLength(len);
    }
    public List<String> binaryTreePaths(TreeNode root) {
        ArrayList<String> list=new ArrayList<>();
        help(root,new StringBuilder(), list);
        return list;
    }
}