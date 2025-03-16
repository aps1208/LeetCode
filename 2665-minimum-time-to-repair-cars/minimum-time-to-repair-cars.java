class Solution {
    public boolean help(long mid, int[] ranks, int cars)
    {
        long cnt=0;
        for(long i:ranks) cnt+=(long) Math.sqrt(mid/i);
        return cnt>=cars;
    }
    public long repairCars(int[] ranks, int cars) {
        long result=0,l=1,h=Long.MAX_VALUE;
        //for(int i:ranks) h=Math.max(i,h);
        //h*=(cars*cars);
        while(l<=h)
        {
            long mid=(l+h)/2;
            if(help(mid,ranks,cars))
            {
                result=mid;
                h=mid-1;
            }
            else l=mid+1;
        }
        return result;
    }
}