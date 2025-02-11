class Solution {
    public String removeOccurrences(String s, String part) {
        Stack<Character> stk=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            stk.push(s.charAt(i));
            int j=part.length()-1;
            Stack<Character> stk2=new Stack<>();
            while(!stk.isEmpty() && j>=0 && stk.peek()==part.charAt(j))
            {
                stk2.push(stk.pop());
                j--;
            }
            while(j>=0 && !stk2.isEmpty()) stk.push(stk2.pop());
        }
        String ans="";
        while(!stk.isEmpty())
        {
            ans=stk.pop()+ans;
        }  
        return ans; 
    }
}