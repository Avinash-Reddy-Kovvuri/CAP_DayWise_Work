class Solution {
   
    private ArrayList<Integer> res = new ArrayList<>();
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        find(0,adj);
        return res;
        
        
        
    }
    public void find(int val,ArrayList<ArrayList<Integer>> adj){
        
        res.add(val);
        for(int a : adj.get(val)){
            if(!res.contains(a))
            find(a,adj);
        }
        
    }
}



OR 

class Solution {
    // Function to return a list containing the DFS traversal of the graph.
    private ArrayList<Integer> res = new ArrayList<>();
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        boolean [] vis = new boolean[V];
        find(0,adj,vis);
        return res;
        
        
        
    }
    public void find(int val,ArrayList<ArrayList<Integer>> adj,boolean [] vis){
        
        res.add(val);
        vis[val] = true;
        for(int a : adj.get(val)){
            if(!vis[a])
            find(a,adj,vis);
        }
        
    }
}
