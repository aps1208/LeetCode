class Solution {
    public int numberOfSubstrings(String s) {
        int i=0,j=0,n=s.length(),result=0;
        int a=0,b=0,c=0;
        while(i<n)
        {
            while((a<1 || b<1 || c<1) && i<n)
            {
                if(s.charAt(i)=='a') a++;
                else if(s.charAt(i)=='b') b++;
                else c++;
                i++;
            }
            while((a>0 && b>0 && c>0))
            {
                result+=n-(i-1);
                if(s.charAt(j)=='a') a--;
                else if(s.charAt(j)=='b') b--;
                else c--;
                j++;
            }
        }
        return result;
    }
}