class Solution {
    public int minimumRecolors(String blocks, int k) {
        char[] arr=blocks.toCharArray();
        int i=0,j=0,w=0;
        while(i<k)
        {
            if(arr[i]=='W') w++;
            i++;
        }
        int result=w;
        while(i<arr.length)
        {
            if(arr[i]=='W') w++;
            i++;
            if(arr[j]=='W') w--;
            j++;
            result=Math.min(result,w);
        }
        return result;
    }
}