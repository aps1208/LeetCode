class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int row=grid.length,col=grid[0].length;
        int[] rowCount=new int[row];
        int[] colCount=new int[col];
        for(int i=0;i<row;i++)
        {
            int onecount=0,zerocount=0;
            for(int j=0;j<col;j++)
            {
                if(grid[i][j]==1) onecount++;
                else zerocount++;
                
            }
            rowCount[i]=onecount-zerocount;
        }
        for(int i=0;i<col;i++)
        {
            int onecount=0,zerocount=0;
            for(int j=0;j<row;j++)
            {
                if(grid[j][i]==1) onecount++;
                else zerocount++;
            }
            colCount[i]=onecount-zerocount;
        }
        int[][] diff=new int[row][col];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                diff[i][j]=rowCount[i]+colCount[j];
            }
        }
        return diff;
    }
}