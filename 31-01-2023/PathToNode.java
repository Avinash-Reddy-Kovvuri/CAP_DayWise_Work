public class Solution {
    public int[] solve(TreeNode A, int B) {
        
        String s = find(A,"",B);
        String [] ans = s.split(" ");
        int [] res = new int[ans.length];
        for(int i=0;i<ans.length;i++){
            res[i] = Integer.parseInt(ans[i]);
        }
        return res;}
        
        
    public String find(TreeNode A,String li,int B){
        
        if(A==null) return "";
        if(A.val==B){
            li+=String.valueOf(A.val)+" ";
            return li;
        }
        li+=String.valueOf(A.val)+" ";
        String lef = find(A.left,li,B);
        
        String rig = find(A.right,li,B);
        
        if(lef.length()!=0) return lef;
        if(rig.length()!=0) return rig;
        
        return "";
        
        
    }
}
