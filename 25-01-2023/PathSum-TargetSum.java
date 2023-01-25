class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
       
        if(root==null){return false;}
         targetSum-=root.val;
        if(targetSum==0 && root.left==null && root.right==null){return true;}
        else if(root.left==null && root.right==null){return false;}
        
        boolean left = hasPathSum(root.left,targetSum);
        boolean right =hasPathSum(root.right,targetSum);
        if(left || right){return true;}
        return false;

    }
    
}
