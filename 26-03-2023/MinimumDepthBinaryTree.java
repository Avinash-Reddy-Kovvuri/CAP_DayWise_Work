class Solution {
    public int minDepth(TreeNode root) {
        if(root==null){return 0;}
        if(root.left==null && root.right==null){return 1;}
        int lf = minDepth(root.left);
        int rf = minDepth(root.right);
         if(lf==0){return rf+1;}
         if(rf==0){return lf+1;}
        return Math.min(lf,rf)+1;
        
    }
}
