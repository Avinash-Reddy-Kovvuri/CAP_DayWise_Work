class Solution {
    // Function to return Breadth First Traversal of given graph.
    ArrayList<Integer> res = new ArrayList<>();
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        boolean vis[] = new boolean[V];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        vis[0] = true;
        res.add(0);
        while(queue.size()!=0){
            int val = queue.poll();
            for(int va : adj.get(val)){
                if(!vis[va]){
                    queue.add(va);
                    res.add(va);
                    vis[va]= true;
                }
            }
        }
        return res;
    }
}
