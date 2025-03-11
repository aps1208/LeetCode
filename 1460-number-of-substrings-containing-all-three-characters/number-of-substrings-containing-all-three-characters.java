class Solution {
    public int numberOfSubstrings(String s) {
        int i=0,j=0,n=s.length(),result=0;
        HashMap<Character,Integer> map=new HashMap<>();
        while(i<n)
        {
            while(map.size()<3 && i<n)
            {
                map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
                i++;
            }
            while(map.size()==3)
            {
                result+=n-(i-1);
                map.put(s.charAt(j),map.get(s.charAt(j))-1);
                if(map.get(s.charAt(j))==0) map.remove(s.charAt(j));
                j++;
            }
        }
        return result;
    }
}