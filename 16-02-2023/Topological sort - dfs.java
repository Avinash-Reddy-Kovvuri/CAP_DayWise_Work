import java.util.* ;
import java.io.*; 
public class Solution 
{
    public static ArrayList<Integer> topologicalSort(ArrayList<ArrayList<Integer>> edges, int v, int e) 
    {
        // Write your code here
        ArrayList<Integer> res = new ArrayList<>();
        boolean[] vis = new boolean[v];
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>(v);

        for(int i=0;i<v;i++){
            adj.add(new ArrayList<>());
        }
        for(int j=0;j<e;j++){
            int a = edges.get(j).get(0);
            int b = edges.get(j).get(1);
            adj.get(a).add(b);
        }
         for(int k=0;k<v;k++){
                if(!vis[k])
            { dfs(k,res,vis,adj);}
         }
        // dfs(0,res,vis,adj);
        // System.out.println(res);
        ArrayList<Integer> r = new ArrayList<>();
        for(int i=res.size()-1;i>=0;i--){
            r.add(res.get(i));
        }
        return r;

    }
    public static void dfs(int src,ArrayList<Integer> res, boolean[] vis,ArrayList<ArrayList<Integer>> adj){
        
        vis[src]=true;
        for(int nei : adj.get(src)){
                if(!vis[nei]) dfs(nei,res,vis,adj);
        }
        res.add(src);
        
    }
}
