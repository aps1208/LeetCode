class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int cnt=0,i=0,j=0,n=colors.length;
        while(j<colors.length)
        {
            while(colors[i%n]!=colors[(i+1)%n] && i<(k+n-2)) i++;
            int len=(i-j)+1;
            if(len>=k) cnt+=len-(k-1);
            i++;
            j=i;
        }
        return cnt;
    }
}