class Solution {
    public long repairCars(int[] ranks, int cars) {
        long result=0,l=1,h=Integer.MAX_VALUE;
        for(int i:ranks) h=Math.min(i,h);
        h=h*cars*cars;
        while(l<=h)
        {
            long mid=(l+h)/2,cnt=0;
            for(long i:ranks) cnt+=(long) Math.sqrt(mid/i);
            if(cnt>=cars)
            {
                result=mid;
                h=mid-1;
            }
            else l=mid+1;
        }
        return result;
    }
}