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
    public void help(TreeNode root, PriorityQueue<Integer> que)
    {
        if(root.left!=null || root.right!=null) que.add(root.val);
        if(root.left==null && root.right==null) 
        {
            que.add(root.val);
            return;
        }
        if(root.left!=null) help(root.left,que);
        if(root.right!=null) help(root.right,que);
        return;
    }
    public int kthSmallest(TreeNode root, int k) {
        PriorityQueue<Integer> que=new PriorityQueue<>();
        help(root,que);
        int i=1;
        while(i<k)
        {
            que.poll();
            i++;
        }
        return que.poll();
    }
}