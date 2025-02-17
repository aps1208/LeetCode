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
    static List<List<Integer>> result=new ArrayList<>();
    public void help(TreeNode root, int sum, int targetSum, ArrayList<Integer> list)
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
            help(root.left, sum, targetSum, list1);
        }
        if(root.right!=null) 
        {
            ArrayList<Integer> list2=new ArrayList<>();
            for(int i: list) 
            {
                list2.add(i);
            }
            help(root.right, sum, targetSum, list2);
        }
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        if(root==null) return result;
        ArrayList<Integer> list=new ArrayList<>();
        help(root, 0, targetSum, list);
        List<List<Integer>> ans=new ArrayList<>();
        for(List<Integer> i: result) ans.add(i);
        result.clear();
        return ans;
    }
}