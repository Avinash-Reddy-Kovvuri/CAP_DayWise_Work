class Solution {
    int max;
    public int diameterOfBinaryTree(TreeNode root) { 

        diameter(root);
        return max;        
    }
    public int diameter(TreeNode root){

        if(root==null){return 0;}
        int lf = diameter(root.left);
        int rf = diameter(root.right);

        max = Math.max(lf+rf,max);

        return Math.max(lf,rf)+1;
    }
}
