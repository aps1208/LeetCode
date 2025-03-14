class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int inc=1,dec=1,result=1;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]<nums[i+1])
            {
                inc++;
                dec=1;
            }
            else if(nums[i]>nums[i+1])
            {
                dec++;
                inc=1;
            }
            else 
            {
                inc=1;
                dec=1;
            }
            result=Math.max(result,Math.max(inc,dec));
        }
        return result;
    }
}