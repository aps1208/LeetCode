class Solution {
    public int minimumLength(String s) {
        int[] freq=new int[26];
        for(char i:s.toCharArray())
        {
            freq[i-'a']++;
        }
        int result=0;
        for(int i=0;i<26;i++)
        {
            if(freq[i]==0)
            {
                continue;
            }
            if(freq[i]%2==0)
            {
                result+=2;
            }
            else if(freq[i]%2==1)
            {
                result+=1;
            }
        }
        return result;
    }
}