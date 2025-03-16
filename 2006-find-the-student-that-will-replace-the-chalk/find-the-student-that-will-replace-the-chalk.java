class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        long[] arr=new long[chalk.length];
        long sum=0;
        for(int i=0;i<chalk.length;i++)
        {
            sum+=chalk[i];
            arr[i]=sum;
        }
        long rem=((long) k)%sum;
        if(k==0) return 0;
        int l=0,h=chalk.length-1,result=0;
        while(l<=h)
        {
            int mid=(l+h)/2;
            if(arr[mid]<=rem) l=mid+1;
            else 
            {
                result=mid;
                h=mid-1;
            }
        }
        return result;
    }
}