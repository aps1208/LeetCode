class Solution {
    public int maxAscendingSum(int[] nums) {
        int result=0,sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            if(i==nums.length-1 || nums[i]>=nums[i+1])
            {
                result=Math.max(sum,result);
                sum=0;
            }
        }
        return result;
    }
}