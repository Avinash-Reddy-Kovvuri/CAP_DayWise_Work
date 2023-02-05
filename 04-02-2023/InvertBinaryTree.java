class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root==null) return null;
        TreeNode lef = invertTree(root.right);
        TreeNode rig = invertTree(root.left);
        root.left = lef;
        root.right = rig;
        return root;
         
    }
}
