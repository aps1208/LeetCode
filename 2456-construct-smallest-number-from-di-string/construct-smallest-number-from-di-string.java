class Solution {
    public String smallestNumber(String pattern) {
        int smallVal=1, i=0,dcnt=0,icnt=0;
        StringBuilder str=new StringBuilder();
        HashSet<Integer> set=new HashSet<>();
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
                if(!set.contains(smallVal))
                {
                    str.append(smallVal);
                    set.add(smallVal);
                    icnt--;
                }
                smallVal++;
            }
            while(dcnt>0)
            {
                if(!set.contains(bigVal))
                {
                    str.append(bigVal);
                    set.add(bigVal);
                    dcnt--;
                }
                bigVal--;
            }
            while(set.contains(smallVal)) smallVal++;
            i=j;
        }
        return str.toString();
    }
}