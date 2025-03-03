class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int[] result=new int[nums.length];
        int i=0,start=0,j=nums.length-1,end=nums.length-1;
        while(start<nums.length && end>=0)
        {
            if(nums[start]<pivot)
            {
                result[i]=nums[start];
                i++;
            }
            if(nums[end]>pivot)
            {
                result[j]=nums[end];
                j--;
            }
            start++;
            end--;
        }
        for(int k=i;k<=j;k++) result[k]=pivot;
        return result;

    }
}