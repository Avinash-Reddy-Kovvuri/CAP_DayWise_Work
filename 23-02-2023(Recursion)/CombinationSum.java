class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
     List<List<Integer>> nn = subSet(candidates,target);
        // System.out.println(nn);
        return nn;
    }
    public List<List<Integer>> subSet(int arr[],int sum){

        Set<ArrayList<Integer>> res = new HashSet<>();
        find(arr,sum,arr.length,0,new ArrayList<Integer>(),res);
        List<List<Integer>> result = new ArrayList<>();
        for(ArrayList<Integer> k : res){
            // System.out.println(k);
             result.add(k);
        }
        // System.out.println(res);
        return result;
    }
    public static void find(int[] arr,int sum,int len,int i,ArrayList<Integer> cum, Set<ArrayList<Integer>> res){

        if(i==len){
            if(sum==0){
            ArrayList<Integer> copy = new ArrayList<>(cum);
            Collections.sort(copy);
            res.add(copy);}
            return;
        }
        if(sum<0) return;
        if(sum==0){
            ArrayList<Integer> copy = new ArrayList<>(cum);
            Collections.sort(copy);
            res.add(copy);}
        cum.add(arr[i]);
        // System.out.println("In first rec "+cum);
        find(arr,sum-arr[i],len,i,cum,res);
        cum.remove(cum.size()-1);
        find(arr,sum,len,i+1,cum,res);
    }
}
