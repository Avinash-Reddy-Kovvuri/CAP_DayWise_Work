class Solution {
    public boolean bol=true;
    public boolean isBalanced(TreeNode root) {
        if(root==null){return true;}
        if(root.left==null & root.right==null){return true;}
        int c = height(root.left)-height(root.right);
        if(c>1 || c<-1){return false;}
        if(root.left==null){return true;}
        if(root.right==null){return true;}
        
        boolean lf = isBalanced(root.left);
        boolean rf = isBalanced(root.right);
        
        return (lf && rf);
        
             
    }

    public int height(TreeNode root){
        if(root==null){return 0;}
        int lf = height(root.left);
        int rf = height(root.right);
        return Math.max(lf,rf)+1;
    }
}
