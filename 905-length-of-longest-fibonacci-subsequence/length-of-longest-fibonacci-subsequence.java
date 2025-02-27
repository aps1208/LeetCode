class Solution {
    /*public int help(int len, int n, int prev, HashMap<Integer,Integer> map, int[] arr)
    {
        if(n>=arr.length) return len;
        if(!map.containsKey(prev+arr[n]) && len<1) return help(len,n+1,prev,map,arr);
        else if(!map.containsKey(prev+arr[n]) && len>=1) return len;
        return Math.max(help(len+1,map.get(prev+arr[n]),arr[n],map,arr),help(len,n+1,prev,map,arr));
    }*/
    public int lenLongestFibSubseq(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++) map.put(arr[i],i);
        int result=0;
        for(int i=0;i<arr.length;i++)
        {
            int j=i+1;
            while(j<arr.length)
            {
                int prev=arr[i],k=j,temp=0;
                while(k<arr.length && map.containsKey(arr[k]+prev))
                {
                    int val=prev;
                    prev=arr[k];
                    k=map.get(arr[k]+val);
                    temp++;
                }
                result=Math.max(result,temp);
                j++;
            }
        }
        if(result!=0) result+=2;
        return result;
        
    }
}