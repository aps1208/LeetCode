class Solution {
    public boolean isArraySpecial(int[] nums) {
        for(int i=0;i<nums.length-1;i++)
        {
            int f=nums[i]%2,lst=nums[i+1]%2;
            if(f==lst)
            {
                return false;
            }
        }
        return true;
    }
}