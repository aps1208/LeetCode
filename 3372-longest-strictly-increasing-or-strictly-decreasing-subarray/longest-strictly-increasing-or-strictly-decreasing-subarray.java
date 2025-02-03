class Solution {
    public int increasing(int[] nums)
    {
        int ans=0,i=0,j=0;
        while(i<nums.length)
        {
            while(i<nums.length-1 && nums[i]<nums[i+1])
            {
                i++;
                ans=Math.max(ans,(i-j)+1);
            }
            i++;
            j=i;
        }
        return ans;
    }
    public int decreasing(int[] nums)
    {
        int ans=1,i=0,j=0;
        while(i<nums.length)
        {
            while(i<nums.length-1 && nums[i]>nums[i+1])
            {
                i++;
                ans=Math.max(ans,(i-j)+1);
            }
            i++;
            j=i;
        }
        return ans;
    }
    public int longestMonotonicSubarray(int[] nums) {
        return Math.max(increasing(nums),decreasing(nums));
    }
}