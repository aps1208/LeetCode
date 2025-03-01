class Solution {
    public int[] applyOperations(int[] nums) {
        int[] result=new int[nums.length];
        int i=0,k=0;
        while(i<nums.length-1)
        {
            if(nums[i]==nums[i+1])
            {
                result[k]=nums[i]*2;
                nums[i+1]=0;
            }
            else
            {
                result[k]=nums[i];
            }
            i++;
            if(nums[i-1]!=0) k++;
        }
        if(nums[i]!=0) result[k]=nums[i];
        return result;
    }
}