class Solution {
    public int maximumCount(int[] nums) {
        int n=nums.length,l=0,h=n-1,pos=-1,neg=-1;
        while(l<=h)
        {
            int mid=(l+h)/2;
            if((nums[mid]<0 && mid+1==n) || (nums[mid]<0 && nums[mid+1]>=0))
            {
                neg=mid;
                break;
            }
            else if(nums[mid]<0) l=mid+1;
            else h=mid-1;
        }
        l=0;
        h=n-1;
        while(l<=h)
        {
            int mid=(l+h)/2;
            if((nums[mid]>0 && mid-1<0) || (nums[mid]>0 && nums[mid-1]<=0))
            {
                pos=mid;
                break;
            }
            else if(nums[mid]>0) h=mid-1;
            else l=mid+1;
        }
        if(pos==-1) return neg+1;
        if(neg==-1) return n-pos;
        return Math.max(neg+1, n-pos);
    }
}