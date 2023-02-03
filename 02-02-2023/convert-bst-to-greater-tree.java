class Solution {
    
    public TreeNode convertBST(TreeNode root) {
        inorder(root,new int [] {0});
        return root;
        
    }
    public void inorder(TreeNode root,int[] s){
        if(root==null) return;
        inorder(root.right,s);
        s[0]+=root.val;
        root.val = s[0];
        inorder(root.left,s);

    }
}
