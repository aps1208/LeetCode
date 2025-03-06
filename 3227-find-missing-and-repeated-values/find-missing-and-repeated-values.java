class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length;
        int[] arr=new int[n*n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++) arr[grid[i][j]-1]++;
        }
        int a=-1,b=-1;
        for(int i=0;i<n*n;i++)
        {
            if(arr[i]==0) a=i+1;
            if(arr[i]==2) b=i+1;
        }
        return new int[]{b,a};
    }
}