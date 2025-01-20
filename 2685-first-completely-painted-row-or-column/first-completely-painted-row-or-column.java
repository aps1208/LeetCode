class Solution {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        int[] map=new int[arr.length+1];
        for(int i=0;i<arr.length;i++)
        {
            map[arr[i]]=i;
        }
        int result=Integer.MAX_VALUE;
        for(int i=0;i<mat.length;i++)
        {
            int temp=0;
            for(int j=0;j<mat[0].length;j++)
            {
                temp=Math.max(temp,map[mat[i][j]]);
            }
            result=Math.min(temp,result);
        }
        for(int i=0;i<mat[0].length;i++)
        {
            int temp=0;
            for(int j=0;j<mat.length;j++)
            {
                temp=Math.max(temp,map[mat[j][i]]);
            }
            result=Math.min(temp,result);
        }
        return result;
    }
}