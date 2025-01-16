class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int m=nums1.length,n=nums2.length;
        if(n%2==0 && m%2==1)
        {
            int first=0;
            for(int i:nums1)
            {
                first^=i;
            }
            int result=0;
            for(int i:nums2)
            {
                result^=(first^i);
            }
            return result;
        }
        else if(n%2==1 && m%2==0)
        {
            int first=0;
            for(int i:nums2)
            {
                first^=i;
            }
            int result=0;
            for(int i:nums1)
            {
                result^=(first^i);
            }
            return result;
        }
        else if(n%2==1 && m%2==1)
        {
            int result=0;
            for(int i:nums1)
            {
                result^=i;
            }
            for(int i:nums2)
            {
                result^=i;
            }
            return result;
        }
        return 0;
    }
}