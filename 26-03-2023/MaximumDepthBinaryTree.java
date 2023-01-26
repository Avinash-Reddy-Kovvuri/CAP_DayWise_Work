class Solution {
    public int maxDepth(TreeNode root) {

        if(root==null){return 0;}
        if(root.left==null && root.right==null){return 1;}
        int lf=maxDepth(root.left);
        int rf = maxDepth(root.right);
        if(lf==0){return rf+1;}
        if(rf==0){return lf+1;}
        return Math.max(lf,rf)+1;

        
        
    }
}
