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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result=new ArrayList<>();
        if(root==null) return result;
        Queue<TreeNode> que=new LinkedList();
        que.add(root); 
        while(!que.isEmpty())
        {
            int size=que.size();
            int val=0;
            for(int i=0;i<size;i++)
            {
                TreeNode temp=que.poll();
                val=temp.val;
                if(temp.left!=null) que.add(temp.left);
                if(temp.right!=null) que.add(temp.right);
            }
            result.add(val);
        }
        return result;
    }
}