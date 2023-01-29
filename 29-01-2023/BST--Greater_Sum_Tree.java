class Solution {
    int s=0;
    public TreeNode bstToGst(TreeNode root) {
        convert(root);
        return root;
        
    }
    public void convert(TreeNode root){
        if(root==null){return;}
        convert(root.right);
        s+=root.val;
        root.val  = s;
        convert(root.left);
    }
}
