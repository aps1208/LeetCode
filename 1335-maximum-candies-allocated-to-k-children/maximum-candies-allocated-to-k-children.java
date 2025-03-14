class Solution {
    public long help (int[] candies, int mid, long k)
    {
        if(mid==0) return k;
        long x=0;
        for(int i:candies)
        {
            x+=i/mid;
        }
        return x;
    }
    public int maximumCandies(int[] candies, long k) {
        int max=0;
        int ans=0;
        for(int i:candies) max=Math.max(i,max);
        int l=0,h=max;
        while(l<=h)
        {
            int m=(l+h)/2;
            long val=help(candies,m,k);
            if(val<k) h=m-1;
            else 
            {
                ans=m;
                l=m+1;
            }
        }
        return ans;
    }
}