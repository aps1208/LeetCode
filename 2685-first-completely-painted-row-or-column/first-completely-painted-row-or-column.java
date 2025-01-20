class Solution {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            map.put(arr[i],i);
        }
        int result=Integer.MAX_VALUE;
        for(int i=0;i<mat.length;i++)
        {
            int temp=0;
            for(int j=0;j<mat[0].length;j++)
            {
                temp=Math.max(temp,map.get(mat[i][j]));
            }
            result=Math.min(temp,result);
        }
        for(int i=0;i<mat[0].length;i++)
        {
            int temp=0;
            for(int j=0;j<mat.length;j++)
            {
                temp=Math.max(temp,map.get(mat[j][i]));
            }
            result=Math.min(temp,result);
        }
        return result;
    }
}