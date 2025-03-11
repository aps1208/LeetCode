class Solution {
    public int numberOfSubstrings(String s) {
        int i=0,j=0,n=s.length(),result=0;
        char[] arr=s.toCharArray();
        HashMap<Character,Integer> map=new HashMap<>();
        while(i<n)
        {
            while(map.size()<3 && i<arr.length)
            {
                map.put(arr[i], map.getOrDefault(arr[i],0)+1);
                i++;
            }
            while(map.size()==3)
            {
                result+=n-(i-1);
                map.put(arr[j],map.get(arr[j])-1);
                if(map.get(arr[j])==0) map.remove(arr[j]);
                j++;
            }
        }
        return result;
    }
}