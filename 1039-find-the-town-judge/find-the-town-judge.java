class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] outdegree=new int[n+1];
        int[] indegree=new int[n+1];
        for(int[] i:trust)
        {
            outdegree[i[0]]++;
            indegree[i[1]]++;
        }
        int judge=-1;
        for(int i=1;i<n+1;i++)
        {
            if(outdegree[i]==0)
            {
                judge=i;
                break;
            }
        }
        if(judge==-1 || indegree[judge]!=n-1) return -1;
        return judge;
    }
}