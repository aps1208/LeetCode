class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        int cnt1=0;
        for(int i=0;i<derived.length;i++)
        {
            if(derived[i]==1)
            {
                cnt1=Math.abs(cnt1-1);
            }
        }
        return cnt1==0;
    }
}