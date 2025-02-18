class Solution {
    public String smallestNumber(String pattern) {
        int smallVal=1, i=0,dcnt=0,icnt=0;
        StringBuilder str=new StringBuilder();
        int[] arr=new int[10];
        while(i<pattern.length())
        {
            int j=i;
            while(j<pattern.length() && pattern.charAt(i)==pattern.charAt(j))
            {
                if(pattern.charAt(i)=='I') icnt++;
                else dcnt++;
                j++;
            }
            int bigVal=smallVal+dcnt;
            if(j==pattern.length() && icnt>0)
            {
                icnt++;
            }
            if(j==pattern.length() && dcnt>0)
            {
                dcnt++;
            }
            while(icnt>0)
            {
                if(arr[smallVal]==0)
                {
                    str.append(smallVal);
                    arr[smallVal]++;
                    icnt--;
                }
                smallVal++;
            }
            while(dcnt>0)
            {
                if(arr[bigVal]==0)
                {
                    str.append(bigVal);
                    arr[bigVal]++;
                    dcnt--;
                }
                bigVal--;
            }
            while(smallVal<10 && arr[smallVal]==1) smallVal++;
            i=j;
        }
        return str.toString();
    }
}