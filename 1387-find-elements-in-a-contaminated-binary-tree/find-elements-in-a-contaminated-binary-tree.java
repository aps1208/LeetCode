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
class FindElements {
    static TreeNode temp=null;
    public void help(TreeNode root)
    {
        if(root==null) return;
        int n=root.val;
        if(root.left!=null) root.left.val=2*n+1;
        if(root.right!=null) root.right.val=2*n+2;
        help(root.left);
        help(root.right);
        return;
    }
    public boolean find(TreeNode root, int target)
    {
        if(root==null) return false;
        if(root.val==target) return true;
        return (find(root.left, target) || find(root.right,target));
    }
    public FindElements(TreeNode root) {
        temp=root;
        root.val=0;
        help(root);
    }
    
    public boolean find(int target) {
        return find(temp, target);
    }
}

/**
 * Your FindElements object will be instantiated and called as such:
 * FindElements obj = new FindElements(root);
 * boolean param_1 = obj.find(target);
 */