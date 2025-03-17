class Solution {
    public int help(int[][] arr, int end)
    {
        int l=0,h=arr.length-1,result=-1;
        while(l<=h)
        {
            int mid=(l+h)/2;
            if(arr[mid][0]>=end)
            {
                result=arr[mid][1];
                h=mid-1;
            }
            else l=mid+1;
        }
        return result;
    }
    public int[] findRightInterval(int[][] intervals) {
        int[] result=new int[intervals.length];
        int[][] arr=new int[intervals.length][2];
        for(int i=0;i<intervals.length;i++)
        {
            arr[i][0]=intervals[i][0];
            arr[i][1]=i;
        }
        Arrays.sort(arr, (a,b)->Integer.compare(a[0],b[0]));
        for(int i=0;i<intervals.length;i++)
        {
            int val=help(arr,intervals[i][1]);
            result[i]=val;
        }
        return result;
    }
}