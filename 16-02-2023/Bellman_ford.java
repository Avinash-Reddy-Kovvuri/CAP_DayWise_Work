import java.util.* ;
import java.io.*; 
public class Solution {
    static int bellmonFord(int n, int m, int src, int dest, ArrayList<ArrayList<Integer>> edges) {
      // Write your code here.
      int[] dis = new int[n+1];
      for(int i=0;i<dis.length;i++){
        dis[i]=1000000000;
      }
      dis[src]=0;
      for(int i=1;i<n;i++){
        for(int j=0;j<edges.size();j++){
          int u = edges.get(j).get(0);
          int v = edges.get(j).get(1);
          int w = edges.get(j).get(2);
          if(dis[u]!=1000000000 && dis[v]>dis[u]+w){
            dis[v]=dis[u]+w;
          }
        }
      }

      return dis[dest];



    }
    
}
