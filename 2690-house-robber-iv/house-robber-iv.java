class Solution {
    public boolean help(int mid,int[] nums,int k)
    {
        int cnt=0,i=0;
        while(i<nums.length)
        {
            if(nums[i]<=mid)
            {
                cnt++;
                i++;
            }
            i++;
        }
        return cnt>=k;
    }
    public int minCapability(int[] nums, int k) {
        int l=Integer.MAX_VALUE,h=1,result=0;
        for(int i:nums)
        {
            if(i<l) l=i;
            if(i>h) h=i;
        }
        while(l<=h)
        {
            int mid=(h+l)/2;
            if(help(mid,nums,k))
            {
                result=mid;
                h=mid-1;
            }
            else l=mid+1;
        }
        return result;
    }
}