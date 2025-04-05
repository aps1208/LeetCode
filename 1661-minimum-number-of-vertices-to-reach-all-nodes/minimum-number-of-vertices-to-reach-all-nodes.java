class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        boolean[] vis=new boolean[n];
        for(List<Integer> i:edges)
        {
            vis[i.get(1)]=true;
        }
        List<Integer> result=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            if(!vis[i]) result.add(i);
        }
        return result;
    }
}