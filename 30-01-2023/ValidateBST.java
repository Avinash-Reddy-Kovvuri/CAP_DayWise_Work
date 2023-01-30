class Solution {
    List<Integer> lis = new ArrayList<>();
    public boolean isValidBST(TreeNode root) {
        Inorder(root);
        for(int i=0;i<lis.size()-1;i++){
            if(lis.get(i)>=lis.get(i+1)) return false;

        }
        return true;       
    }
    public void Inorder(TreeNode root){
        if(root==null) return;
        Inorder(root.left);
        lis.add(root.val);
        Inorder(root.right);
    }
}
