import java.util.ArrayList;

public class Solution {
  static int floydWarshall(int n, int m, int src, int dest, ArrayList<ArrayList<Integer>> edges) {
    // Write your code here.
    int mat[][] = new int[n+1][n+1];

    for(int i=0;i<edges.size();i++){
      int s = edges.get(i).get(0);
      int d = edges.get(i).get(1);
      int w = edges.get(i).get(2);
      mat[s][d] = w;
    }
    
    

    for(int k=1;k<=n;k++){
      for(int i=1;i<=n;i++){
        for(int j=1;j<=n;j++){
          mat[i][j] = Math.min(mat[i][j],mat[i][k]+mat[k][j]);
 
        }
      }
    }
    System.out.println(mat[0][1]);
    return mat[src][dest];
    }

    

  }


