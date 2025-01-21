class Solution {
    public long gridGame(int[][] grid) {
        int len=grid[0].length;
        long[][] ans=new long[2][len];
        long result=Long.MAX_VALUE;
        long sum=0;
        for(int i=0;i<len;i++)
        {
            sum+=grid[0][i];
            ans[0][i]=sum;
        }
        sum=0;
        for(int i=len-1;i>=0;i--)
        {
            sum+=grid[1][i];
            ans[1][i]=sum;
        }
        for(int i=0;i<len;i++)
        {
            long temp=Math.max(ans[0][len-1]- ans[0][i], ans[1][0]-ans[1][i]);
            result=Math.min(temp,result);
        }
        return result;
    }
}