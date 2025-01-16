class Solution {
    public int minimumLength(String s) {
        int[] freq=new int[26];
        for(char i:s.toCharArray())
        {
            freq[i-'a']++;
        }
        for(int i=0;i<26;i++)
        {
            if(freq[i]>2 && freq[i]%2==0)
            {
                freq[i]=2;
            }
            else if(freq[i]>2 && freq[i]%2==1)
            {
                freq[i]=1;
            }
        }
        int result=0;
        for(int i:freq)
        {
            result+=i;
        }
        return result;
    }
}