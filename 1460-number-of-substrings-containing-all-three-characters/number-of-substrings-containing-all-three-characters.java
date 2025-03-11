class Solution {
    public int numberOfSubstrings(String s) {
        int i=0,j=0,n=s.length(),result=0,a=0,b=0,c=0;
        char[] arr=s.toCharArray();
        while(i<n)
        {
            while((a<1 || b<1 || c<1) && i<n)
            {
                if(arr[i]=='a') a++;
                else if(arr[i]=='b') b++;
                else c++;
                i++;
            }
            while((a>0 && b>0 && c>0))
            {
                result+=n-(i-1);
                if(arr[j]=='a') a--;
                else if(arr[j]=='b') b--;
                else c--;
                j++;
            }
        }
        return result;
    }
}