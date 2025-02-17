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
    public void help(TreeNode root, int sum, int targetSum, ArrayList<Integer> list, List<List<Integer>> result )
    {
        sum+=root.val;
        list.add(root.val);
        if(root.left==null && root.right==null && sum==targetSum)
        {
            result.add(list);
            return;
        }
        if(root.left==null && root.right==null && sum!=targetSum) 
        {
            return;
        }
        if(root.left!=null) 
        {
            ArrayList<Integer> list1=new ArrayList<>();
            for(int i: list) 
            {
                list1.add(i);
            }
            help(root.left, sum, targetSum, list1, result);
        }
        if(root.right!=null) 
        {
            ArrayList<Integer> list2=new ArrayList<>();
            for(int i: list) 
            {
                list2.add(i);
            }
            help(root.right, sum, targetSum, list2, result);
        }
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        ArrayList<Integer> list=new ArrayList<>();
        List<List<Integer>> result=new ArrayList<>();
        if(root==null) return result;
        help(root, 0, targetSum, list, result);
        return result;
    }
}