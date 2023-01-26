class Solution {
    int max;
    public int maxPathSum(TreeNode root) {
        max=-10000;
        if(root.left==null && root.right==null){return root.val;}
        find(root);
        return max;

    }
    public int find(TreeNode root){
        
        if(root==null){return 0;}
        int lh = Math.max(0,find(root.left));
        int rh = Math.max(0,find(root.right));
        max = Math.max(lh+rh+root.val,max);
        return Math.max(lh,rh)+root.val;
    }
}
