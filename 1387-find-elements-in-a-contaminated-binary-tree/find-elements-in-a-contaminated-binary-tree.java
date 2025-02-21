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
    public void help(TreeNode root,int n)
    {
        if(root==null) return;
        root.val=n;
        help(root.left,2*n+1);
        help(root.right,2*n+2);
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
        help(root,0);
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