class Solution {
    public int countVowelSubstrings(String word) {
        HashMap<Character,Integer> map=new HashMap<>();
        char[] arr=word.toCharArray();
        int j=0,result=0;
        while(j<=arr.length-5)
        {
            int i=j;
            while(i<arr.length && (arr[i]=='a' || arr[i]=='e' || arr[i]=='i' || arr[i]=='o' || arr[i]=='u'))
            {
                map.put(arr[i],map.getOrDefault(arr[i],0)+1);
                i++;
                if(map.size()==5) result++;
            }
            map.clear();
            j++;
        }
        return result;
    }
}