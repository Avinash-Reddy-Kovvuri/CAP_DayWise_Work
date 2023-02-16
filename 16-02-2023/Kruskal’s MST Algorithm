import java.util.* ;
import java.io.*; 

class DisjointSets{
    ArrayList<Integer> rank = new ArrayList<Integer>();
    ArrayList<Integer> parent = new ArrayList<Integer>();
    DisjointSets(int n){
        for(int i=0;i<=n;i++){
            rank.add(0);
            parent.add(i);
        }
    }

    public int findUp(int num){
        if(num==parent.get(num)) return num;

        int res = findUp(parent.get(num));
        parent.set(num,res);

        return parent.get(num);
    }

    public void unionByRank(int u,int v){
        int ult_u = findUp(u);
        int ult_v = findUp(v);

        if(ult_u == ult_v) return;
        else if(rank.get(ult_u)>rank.get(ult_v)){

            parent.set(ult_v,ult_u);
        }
        else if(rank.get(ult_u)<rank.get(ult_v)){

            parent.set(ult_u,ult_v);
        }
        else{
            parent.set(ult_v,ult_u);
            int ranku = rank.get(ult_u);
            rank.set(ult_u,ranku+1);

        }

    }

}
class Pair implements Comparable<Pair>{
    int dis,src,des;
    Pair(int dis,int src,int des){
        this.dis = dis;
        this.src = src;
        this.des = des;
    }

    public int compareTo(Pair p){
        return this.dis - p.dis;
    }
}
public class Solution {
    public static int kruskalMST(int n, int m, ArrayList<ArrayList<Integer>> graph) {
        // Write your code here.
        ArrayList<Pair> res = new ArrayList<>();
        for(int i=0;i<m;i++){
            // System.out.println(graph.get(i).get(0));
            // break;
            int src = graph.get(i).get(0);
            int des = graph.get(i).get(1);
            int wei = graph.get(i).get(2);
            res.add(new Pair(wei,src,des));
        }
        // System.out.println(res.size());
        Collections.sort(res);
        int sss=0;
        DisjointSets d = new DisjointSets(n);
        for(int i=0;i<m;i++){
            Pair p1 = res.get(i);
            int sou = p1.src;
            int dess = p1.des;
            int wee = p1.dis;
            if(d.findUp(sou) != d.findUp(dess)){
                sss+=wee;
                d.unionByRank(sou, dess);
            }
        }
        return sss;



    }
}
