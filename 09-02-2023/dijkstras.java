import java.util.* ;
import java.io.*; 

class Pair implements Comparable<Pair>{

		int dis;
		int des;
		public Pair(int dis,int des){
			this.dis = dis;
			this.des = des;
		}
		public int compareTo(Pair p1){

			if(this.dis>p1.dis) return 1;
			if(this.dis<p1.dis) return -1;
			return 0;
		}
	}
public class Solution {

	
	
	public static ArrayList < Integer > dijkstra(ArrayList< ArrayList < Integer > > vec, int vertices, int edges, int source){
		// Write your code here.
		ArrayList<ArrayList<Pair>> adj = new ArrayList<>(vertices+1);

		for(int i=0;i<=vertices;i++){
			adj.add(new ArrayList<Pair>());
		}

		// adj.get(0).add(new Pair(4,1));
		for(int j=0;j<vec.size();j++){


			adj.get(vec.get(j).get(0)).add(new Pair(vec.get(j).get(2),vec.get(j).get(1)));
			adj.get(vec.get(j).get(1)).add(new Pair(vec.get(j).get(2),vec.get(j).get(0)));

		}

		PriorityQueue<Pair> pq = new PriorityQueue<>();
		
		int[] dista = new int[vertices];
		for(int i=0;i<dista.length;i++){dista[i]=Integer.MAX_VALUE;}
		pq.add(new Pair(0,source));
		dista[source] = 0;

		while(pq.size()!=0){
			Pair p = pq.poll();
			int dist = p.dis;
			int dest = p.des;

			for(Pair nei : adj.get(dest)){

				int ndist = nei.dis;
				int ndes = nei.des;

				if(dist+ndist < dista[ndes]){
					pq.add(new Pair((dist+ndist),ndes));
					dista[ndes] = dist+ndist;
				}
			}
		}
		ArrayList<Integer> res = new ArrayList<>();
		for(int i=0;i<dista.length;i++){
		res.add(dista[i]);}
		
		
		return res;
		

	}
}
