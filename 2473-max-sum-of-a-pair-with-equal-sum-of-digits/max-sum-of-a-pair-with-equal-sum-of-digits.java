class Solution {
    public int help(int num)
    {
        int ans=0;
        while(num>0)
        {
            ans+=num%10;
            num/=10;
        }
        return ans;
    }
    public int maximumSum(int[] nums) {
        int result=-1;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int sum=help(nums[i]);
            if(map.containsKey(sum))
            {
                int j=map.get(sum);
                result=Math.max(result, nums[i]+nums[j]);
                if(nums[j]<nums[i]) map.put(sum,i);
            }
            else
            {
                map.put(sum,i);
            }
        }
        return result;
    }
}