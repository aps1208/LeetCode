class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums1.length;i++) map.put(nums1[i][0],nums1[i][1]);
        for(int i=0;i<nums2.length;i++) map.put(nums2[i][0],map.getOrDefault(nums2[i][0],0)+nums2[i][1]);
        int[][] result=new int[map.size()][2];
        int k=0;
        for(int i:map.keySet())
        {
            result[k][0]=i;
            result[k][1]=map.get(i);
            k++;
        }
        Arrays.sort(result, (a,b)->Integer.compare(a[0],b[0]));
        return result;
    }
}