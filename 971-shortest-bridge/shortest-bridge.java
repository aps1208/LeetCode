class Solution {
    public void dfs(int[][] grid, int i, int j, Queue<Integer> que)
    {
        if(i<0 || j<0 || i==grid.length || j==grid.length || grid[i][j]==0 || grid[i][j]==2) return;
        que.add(i);
        que.add(j);
        que.add(0);
        grid[i][j]=2;
        grid[i][j]=2;
        dfs(grid, i, j-1, que);
        dfs(grid, i-1, j, que);
        dfs(grid, i, j+1, que);
        dfs(grid, i+1, j, que);
    }
    public int shortestBridge(int[][] grid) {
        int x=-1,y=-1;
        int n=grid.length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j]==1 && x==-1 && y==-1)
                {
                    x=i;
                    y=j;
                    break;
                }
            }
        }
        
        Queue<Integer> que=new LinkedList<>();
        dfs(grid,x,y,que);

        while(!que.isEmpty())
        {

            int i=que.poll(),j=que.poll(),dist=que.poll();
            if(grid[i][j]==1 || (i-1>=0 && grid[i-1][j]==1) || (j-1>=0 && grid[i][j-1]==1) || (i+1<n && grid[i+1][j]==1) || (j+1<n && grid[i][j+1]==1)) return dist;
            if(j-1>=0 && grid[i][j-1]==0)
            {
                grid[i][j-1]=-1;
                que.add(i);
                que.add(j-1);
                que.add(dist+1);
            }
            if(i-1>=0 && grid[i-1][j]==0)
            {
                grid[i-1][j]=-1;
                que.add(i-1);
                que.add(j);
                que.add(dist+1);
            }
            if(j+1<n && grid[i][j+1]==0)
            {
                grid[i][j+1]=-1;
                que.add(i);
                que.add(j+1);
                que.add(dist+1);
            }
            if(i+1<n && grid[i+1][j]==0)
            {
                grid[i+1][j]=-1;
                que.add(i+1);
                que.add(j);
                que.add(dist+1);
            }
        }
        return -1;
    }
}









