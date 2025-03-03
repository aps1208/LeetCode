class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int[] result=new int[nums.length];
        int less=0,equal=0,grtr=0;
        for(int i:nums)
        {
            if(i<pivot) less++;
            else if(i==pivot) equal++;
            else grtr++;
        }
        int ls=0,eq=less,gt=less+equal;
        for(int i:nums)
        {
            if(i<pivot)
            {
                result[ls]=i;
                ls++;
            }
            else if(i==pivot)
            {
                result[eq]=i;
                eq++;
            }
            else
            {
                result[gt]=i;
                gt++;
            }
        }
        return result;
    }
}