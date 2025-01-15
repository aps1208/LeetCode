class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        long first=0,second=0;
        int[] result=new int[A.length];
        for(int i=0;i<A.length;i++)
        {
            first=(first) |  ((long) 1<<(A[i]-1));
            second=(second) | ((long) 1<<(B[i]-1));
            result[i]=Long.bitCount(first & second);
        }
        return result;
    }
}