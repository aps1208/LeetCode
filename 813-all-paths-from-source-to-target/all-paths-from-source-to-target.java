class Solution {
    public void dfs(int[][] graph, int node, List<List<Integer>> result, List<Integer> path, int dest)
    {
        path.add(node);
        if(node==dest) 
        {
            List<Integer> temp=new ArrayList<>();
            for(int i:path) temp.add(i);
            result.add(temp);            
        }
        for(int i:graph[node]) dfs(graph,i,result,path, dest);
        path.remove(path.size()-1);
    }
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        int n=graph.length;
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> path=new ArrayList<>();
        dfs(graph,0,result,path,n-1);
        return result;
    }
}