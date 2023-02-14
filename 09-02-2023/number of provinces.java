class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        //At first we are creating our adjacency list from given adjacency matrix;
        ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(isConnected[i][j]==1 && i!=j){
                    adj.get(i).add(j);
                    adj.get(j).add(i);
                }
            }
        }
        


        int visited[]=new int[n];
        int count=0;
        for(int i=0;i<n;i++){
            if(visited[i]==0){
                count++;
                dfs(i,adj,visited);
            }
        }
        return count;
    }

    public void dfs(int i,ArrayList<ArrayList<Integer>>adj,int visited[]){
        visited[i]=1;
        for(int e:adj.get(i)){
            if(visited[e]==0){
                dfs(e,adj,visited);
            }
        }
    }
}

OR

class Solution {
    
    public int findCircleNum(int[][] isConnected) {

        
        boolean[] vis = new boolean[isConnected.length];
        int c=0;

        for(int i=0;i<isConnected.length;i++){
            if(!vis[i]){
                c+=1;
                bfs(i,isConnected,vis);
            }
        }

        return c;

        
        
    }
    public void bfs(int src,int[][] conn,boolean[] vis){

        vis[src]=true;
        int [] nei = conn[src];
        for(int j=0;j<nei.length;j++){
            if(!vis[j]){
            if(nei[j]==1) bfs(j,conn,vis);
             }
        }

    }
}
