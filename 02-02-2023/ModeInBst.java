
class Solution {
    public int[] findMode(TreeNode root) {
        HashMap<Integer,Integer> li = new HashMap<>();
        inorder(root,li);
        int maxi=0;
        
        for(int i : li.keySet()){
            System.out.println(i);
            maxi = Math.max(maxi,li.get(i));
        }
       
        ArrayList<Integer> l = new ArrayList<>();
        for(int i : li.keySet()){
            if(maxi==li.get(i)){l.add(i);}

        }
        int [] a = new int[l.size()];
        for(int i=0;i<l.size();i++){
            a[i]=l.get(i);
        }

        return a;
        
        
    }
    public void inorder(TreeNode root,HashMap<Integer,Integer> li){
        if(root==null) return;
        inorder(root.left,li);
        li.put(root.val,li.getOrDefault(root.val,0)+1);
        inorder(root.right,li);
    }
}
