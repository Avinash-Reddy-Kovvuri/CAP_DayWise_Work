class Solution {
    ArrayList<Integer> li = new ArrayList<>();
    public int getMinimumDifference(TreeNode root) {
        int dif = Integer.MAX_VALUE;
        inorder(root);
        for(int i=0;i<li.size()-1;i++){
            dif = Math.min(dif,Math.abs(li.get(i)-li.get(i+1)));
        }
        return dif;
        
    }
    public void inorder(TreeNode root){
        if(root==null) return;
        inorder(root.left);
        li.add(root.val);
        inorder(root.right);

    }
    }
