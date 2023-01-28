class Solution {
    int s=0;
    public int rangeSumBST(TreeNode root, int low, int high) {
        if(root==null){return 0;}
        if(root.val<=high && root.val>=low){
            s+=root.val;
            rangeSumBST(root.left,low,high);
            rangeSumBST(root.right,low,high);
            }
        if(root.val>high){
            rangeSumBST(root.left,low,high);
        }
        if(root.val<low){
            rangeSumBST(root.right,low,high);
        }

        return s;
    }
}
