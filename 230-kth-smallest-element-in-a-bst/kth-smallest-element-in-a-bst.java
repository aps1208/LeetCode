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
    static PriorityQueue<Integer> que=new PriorityQueue<>();
    public void help(TreeNode root)
    {
        if(root.left!=null || root.right!=null) que.add(root.val);
        if(root.left==null && root.right==null) 
        {
            que.add(root.val);
            return;
        }
        if(root.left!=null) help(root.left);
        if(root.right!=null) help(root.right);
        return;
    }
    public int kthSmallest(TreeNode root, int k) {
        help(root);
        int i=1;
        while(i<k)
        {
            que.poll();
            i++;
        }
        int ans=que.poll();
        que.clear();
        return ans;
    }
}