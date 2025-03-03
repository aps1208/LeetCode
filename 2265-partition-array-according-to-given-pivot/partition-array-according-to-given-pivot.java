class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int[] result=new int[nums.length];
        int k=0;
        for(int i:nums)
        {
            if(i<pivot)
            {
                result[k]=i;
                k++;
            }
        }
        for(int i:nums)
        {
            if(i==pivot)
            {
                result[k]=i;
                k++;
            }
        }
        for(int i:nums)
        {
            if(i>pivot)
            {
                result[k]=i;
                k++;
            }
        }
        return result;
    }
}