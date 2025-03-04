class Solution {
    public boolean checkPowersOfThree(int n) {
        int[] arr=new int[17];
        while(n>0)
        {
            int temp=1,cnt=0;
            while(temp*3<=n)
            {
                cnt++;
                temp*=3;
            }
            if(arr[cnt]==0)
            {
                n-=temp;
                arr[cnt]++;
            }
            else return false;
        }
        return true;
    }
}