class Solution {
    public int singleNonDuplicate(int[] nums) {
        int l=0,h=nums.length-1;
        while(l<=h)
        {
            int mid=(l+h)/2, left=mid, right=mid;
            if(mid-1>=0 && nums[mid-1]==nums[mid]) left--;
            if(mid+1<nums.length && nums[mid+1]==nums[mid]) right++;
            if(left==right) return nums[mid];
            else if(left%2!=0) h=mid-1;
            else l=mid+1;
        }
        return 0;
    }
}