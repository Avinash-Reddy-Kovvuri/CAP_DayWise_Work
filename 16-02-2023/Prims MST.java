import java.util.* ;
import java.io.*; 
import java.util.ArrayList;
class Pair implements Comparable<Pair>{

		int dis;
		int des;
        int src;
		public Pair(int dis,int des,int src){
			this.dis = dis;
			this.des = des;
            this.src = src;
		}
		public int compareTo(Pair p1){

			if(this.dis>p1.dis) return 1;
			if(this.dis<p1.dis) return -1;
			return 0;
		}
	}
public class Solution 
{
    
    public static ArrayList<ArrayList<Integer>> calculatePrimsMST(int n, int m, ArrayList<ArrayList<Integer>> g)
    {
        // Write your code here.
        ArrayList<ArrayList<Pair>> li = new ArrayList<>(n+1);
        for(int i=0;i<n+1;i++){
            li.add(new ArrayList<Pair>());
        }

        for(int i=0;i<m;i++){
            int s = g.get(i).get(0);
            int d = g.get(i).get(1);
            int w = g.get(i).get(2);
            li.get(s).add(new Pair(w,d,s));
            li.get(d).add(new Pair(w,s,d));

        }
        boolean [] vis = new boolean[n+1];

        PriorityQueue<Pair> pq = new PriorityQueue<>();

        pq.add(new Pair(0,1,-1));

        ArrayList<ArrayList<Integer>> res = new ArrayList<>();

        while(pq.size()!=0){
            Pair pp = pq.poll();
            int sour = pp.src;
            int wei = pp.dis;
            int desti = pp.des;

            if(vis[desti]) continue;
            // System.out.println(desti+" "+wei);
            ArrayList<Integer> lll = new ArrayList<>();
            lll.add(sour);
            lll.add(desti);
            lll.add(wei);
            res.add(lll);
            vis[desti] = true;
            for(Pair t : li.get(desti)){
                // System.out.println("des "+t.des);

                int dest = t.des;
                if(!vis[dest]){
                    pq.add(t);
                }
            }
        }

        
        res.remove(0);
        return res;


    }
}
