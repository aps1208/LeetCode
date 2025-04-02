class Solution {
    public void dfs(int[][] isConnected, boolean[] vis, int node)
    {
 

        vis[node]=true;
 
        for(int i=0;i<isConnected[0].length;i++)
        {
            if(isConnected[node][i]==1 && vis[i]==false)
            {
                dfs(isConnected,vis,i);
            }
        }

    }
    public int findCircleNum(int[][] isConnected) {
        int result=0;
        boolean[] vis=new boolean[isConnected.length];
        for(int i=0;i<isConnected.length;i++)


        {
            if(vis[i]==false)
            {
               result++;
               dfs(isConnected,vis,i);

            }

        }
        return result;
    }
}