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
    public void leftNode(TreeNode root,int start, int end, int idx,int[] preorder, int[] inorder)
    {
        if(start==end) return;
        TreeNode temp=new TreeNode();
        int tempidx=-1;
        for(int i=start;i<end;i++)
        {
            if(preorder[idx]==inorder[i])
            {
                temp.val=inorder[i];
                root.left=temp;
                tempidx=i;
                break;
            }
        }
        if(tempidx==-1)
        {
            leftNode(root,start,end,idx+1,preorder,inorder);
            return;
        }
        leftNode(temp,start,tempidx,idx+1,preorder,inorder);
        rightNode(temp,tempidx+1,end,idx+1,preorder,inorder);
    }
    public void rightNode(TreeNode root,int start, int end, int idx, int[] preorder, int[] inorder)
    {
        if(start==end) return;
        int tempidx=-1;
        TreeNode temp=new TreeNode();
        for(int i=start;i<end;i++)
        {
            if(preorder[idx]==inorder[i])
            {
                temp.val=inorder[i];
                root.right=temp;
                tempidx=i;
                break;
            }
        }
        if(tempidx==-1)
        {
            rightNode(root,start,end,idx+1,preorder,inorder);
            return;
        }
        leftNode(temp,start,tempidx,idx+1,preorder,inorder);
        rightNode(temp,tempidx+1,end,idx+1,preorder,inorder);
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        TreeNode root=new TreeNode(preorder[0]);
        int tempidx=-1;
        for(int i=0;i<inorder.length;i++)
        {
            if(inorder[i]==preorder[0])
            {
                tempidx=i;
                break;
            }
        }
        leftNode(root,0,tempidx,1,preorder,inorder);
        rightNode(root,tempidx+1,preorder.length,1,preorder,inorder);
        return root;
    }
}