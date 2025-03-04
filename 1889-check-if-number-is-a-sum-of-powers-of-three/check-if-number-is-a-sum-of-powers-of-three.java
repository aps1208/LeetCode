class Solution {
    public boolean checkPowersOfThree(int n) {
        HashSet<Integer> set=new HashSet<>();
        boolean flag=true;
        while(n>0 && flag)
        {
            int temp=1,cnt=0;
            while(temp*3<=n)
            {
                cnt++;
                temp*=3;
            }
            if(!set.contains(cnt))
            {
                n-=temp;
                set.add(cnt);
            }
            else flag=false;
        }
        return n==0;
    }
}