class Solution {
    public TreeNode bstFromPreorder(int[] preorder) {
        int upper = Integer.MAX_VALUE;
        return constr(preorder,upper, new int[] {0});
        
    }
    public TreeNode constr(int[] preorder,int upper,int[] index){
        if(index[0]==preorder.length || preorder[index[0]]>upper) return null;

        TreeNode root = new TreeNode(preorder[index[0]++]);
        root.left = constr(preorder,root.val,index);
        root.right = constr(preorder,upper,index);
        return root;
    }
}
