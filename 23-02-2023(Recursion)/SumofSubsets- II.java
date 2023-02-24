class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
         List<List<Integer>> nn = subSet(nums);
        // System.out.println(nn);
        return nn;
    }
    public List<List<Integer>> subSet(int arr[]){

        Set<ArrayList<Integer>> res = new HashSet<>();
        find(arr,arr.length,0,new ArrayList<Integer>(),res);
        List<List<Integer>> result = new ArrayList<>();
        for(ArrayList<Integer> k : res){
            // System.out.println(k);
             result.add(k);
        }
        // System.out.println(res);
        return result;
    }
    public static void find(int[] arr,int len,int i,ArrayList<Integer> cum, Set<ArrayList<Integer>> res){

        if(i==len){
            ArrayList<Integer> copy = new ArrayList<>(cum);
            Collections.sort(copy);
            res.add(copy);
            return;
        }
        cum.add(arr[i]);
        // System.out.println("In first rec "+cum);
        find(arr,len,i+1,cum,res);
        cum.remove(cum.size()-1);
        find(arr,len,i+1,cum,res);
    }

        
    
}
