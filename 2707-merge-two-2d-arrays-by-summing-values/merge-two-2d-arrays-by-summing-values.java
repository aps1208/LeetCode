class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums1.length;i++) set.add(nums1[i][0]);
        for(int i=0;i<nums2.length;i++) set.add(nums2[i][0]);
        int[][] result=new int[set.size()][2];
        int i=0,j=0,k=0;
        while(i<nums1.length && j<nums2.length)
        {
            if(nums1[i][0]==nums2[j][0])
            {
                result[k][0]=nums1[i][0];
                result[k][1]=nums1[i][1]+nums2[j][1];
                i++;
                j++;
            }
            else if(nums1[i][0]<nums2[j][0])
            {
                result[k][0]=nums1[i][0];
                result[k][1]=nums1[i][1];
                i++;
            }
            else
            {
                result[k][0]=nums2[j][0];
                result[k][1]=nums2[j][1];
                j++;
            }
            k++;
        }
        while(i<nums1.length)
        {
            result[k][0]=nums1[i][0];
            result[k][1]=nums1[i][1];
            i++;
            k++;
        }
        while(j<nums2.length)
        {
            result[k][0]=nums2[j][0];
            result[k][1]=nums2[j][1];
            j++;
            k++;
        }
        return result;
    }
}