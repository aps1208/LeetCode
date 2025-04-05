class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int n=text1.length(),m=text2.length();
        int[][] dp=new int[n+1][m+1];
        char[] arr1=text1.toCharArray();
        char[] arr2=text2.toCharArray();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=m;j++)
            {
                if(arr1[i-1]==arr2[j-1])
                {
                    dp[i][j]=dp[i-1][j-1]+1;
                }
                else
                {
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[n][m];
    }
}