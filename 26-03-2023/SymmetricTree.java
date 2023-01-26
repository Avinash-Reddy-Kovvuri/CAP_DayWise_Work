class Solution {
    public boolean isSymmetric(TreeNode root) {

        if(root == null){return true;}
        return isSs(root.left,root.right);       
    }
    public boolean isSs(TreeNode lef,TreeNode rig){
        if(lef==null && rig==null){return true;}
        if(lef==null){return false;}
        if(rig== null){return false;}
        if(lef.val != rig.val){return false;}
        return isSs(lef.left,rig.right) && isSs(rig.left,lef.right);
    }
}
