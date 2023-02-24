
class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
      
     List<List<Integer>> nn = subSet(candidates,target);
        System.out.println(nn);
        return nn;
    }
    public List<List<Integer>> subSet(int arr[],int sum){

        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        Arrays.sort(arr);
        find(arr,sum,arr.length,0,new ArrayList<Integer>(),res);
        List<List<Integer>> result = new ArrayList<>();   
        for(ArrayList<Integer> k : res){    
             result.add(k);
        }
        return result;
    }
    public static void find(int[] arr,int sum,int len,int i,ArrayList<Integer> cum, ArrayList<ArrayList<Integer>> res){

        if(sum==0){
            ArrayList<Integer> copy = new ArrayList<>(cum);
            res.add(copy);
            return;
            }
        // else if(i==len){
        //     return;
        // }
        // else if(sum<0) return;   
        for(int a=i;a<arr.length;a++){
            if(a>i && arr[a]==arr[a-1]) continue;
            if(arr[a]>sum) break;

            cum.add(arr[a]);
        // System.out.println("In first rec "+cum);
        find(arr,sum-arr[a],len,a+1,cum,res);
        cum.remove(cum.size()-1);

        }    
        
        // find(arr,sum,len,i+1,cum,res);
    }
}
