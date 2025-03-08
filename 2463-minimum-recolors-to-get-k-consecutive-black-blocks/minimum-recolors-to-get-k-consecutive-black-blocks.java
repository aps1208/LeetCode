class Solution {
    public int minimumRecolors(String blocks, int k) {
        char[] arr=blocks.toCharArray();
        int i=0,j=0,w=0,b=0,result=Integer.MAX_VALUE;
        while(i<arr.length)
        {
            while(w+b<k && i<arr.length)
            {
                if(arr[i]=='W') w++;
                else b++;
                i++;
            }
            result=Math.min(result,w);
            if(arr[j]=='W') w--;
            else b--;
            j++;
        }
        return result;
    }
}