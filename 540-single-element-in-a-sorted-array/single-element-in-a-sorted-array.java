class Solution {
    public int help(int[] nums, int l, int h)
    {
        if(l>h) return -1;
        int mid=(l+h)/2;
        if((mid-1>=0 && nums[mid-1]!=nums[mid]) && (mid+1<nums.length && nums[mid+1]!=nums[mid]))
        {
            return nums[mid];
        }
        if(mid-1<0 && nums[mid+1]!=nums[mid]) return nums[mid];
        if(mid+1>=nums.length && nums[mid-1]!=nums[mid]) return nums[mid];
        int left=help(nums,l,mid-1);
        int right=help(nums,mid+1,h);
        if(left!=-1) return left;
        return right;
    }
    public int singleNonDuplicate(int[] nums) {
        if(nums.length==1) return nums[0];
        return help(nums,0,nums.length-1);
    }
}