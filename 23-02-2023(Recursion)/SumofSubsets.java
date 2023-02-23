import java.util.* ;
import java.io.*; 
public class Solution {

    
    public static ArrayList<Integer> subsetSum(int num[]) {
        // Write your code here..
        
       ArrayList<Integer> rr = subSet(num);
        Collections.sort(rr);
        return rr;
    }

    public static ArrayList<Integer> subSet(int num[]){
        ArrayList<Integer> col = new ArrayList<>();
        find(num,0,new ArrayList<Integer>(),col);
        return col;


    }
    public static void find(int num[],int i,ArrayList<Integer> cum,ArrayList<Integer> res){

        
        if(i==num.length){
            int sum=0;
        for(int a=0;a<cum.size();a++){sum+=cum.get(a);}
        res.add(sum);
        return;

        }
        cum.add(num[i]);
        find(num,i+1,cum,res);
        cum.remove(cum.size()-1);
       
        find(num,i+1,cum,res);
    }

}
