class Solution {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        HashMap<Integer, int[]> map=new HashMap<>();
        int row=mat.length,col=mat[0].length;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                map.put(mat[i][j], new int[]{i,j});
            }
        }
        int[] rowCount=new int[row];
        int[] colCount=new int[col];
        for(int i=0;i<arr.length;i++)
        {
            int[] temp=map.get(arr[i]);
            rowCount[temp[0]]++;
            colCount[temp[1]]++;
            if(rowCount[temp[0]]==col || colCount[temp[1]]==row)
            {
                return i;
            }
        }
        return 0; 
    }
}