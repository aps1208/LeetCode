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
    public TreeNode recoverFromPreorder(String traversal) {
        HashMap<Integer,TreeNode> map=new HashMap<>();
        int i=0,val=0;
        while(i<traversal.length() && traversal.charAt(i)!='-')
        {
            val=val*10+(traversal.charAt(i)-'0');
            i++;
        }
        TreeNode root=new TreeNode(val);
        map.put(0,root);
        while(i<traversal.length())
        {
            int cnt=0;
            while(traversal.charAt(i)=='-')
            {
                cnt++;
                i++;
            }
            val=0;
            while(i<traversal.length() && traversal.charAt(i)!='-')
            {
                val=val*10+(traversal.charAt(i)-'0');
                i++;
            }
            TreeNode temp=new TreeNode(val);
            TreeNode temp2=map.get(cnt-1);
            if(temp2.left==null) temp2.left=temp;
            else temp2.right=temp;
            map.put(cnt,temp);
        }
        return root;
    }
}