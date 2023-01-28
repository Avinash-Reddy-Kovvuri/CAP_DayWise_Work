class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode ins = new TreeNode(val);
        if(root==null){
            root=ins;
            return root;
        }
        TreeNode parent = null;
        TreeNode curr = root;
        while(curr!=null){
            parent = curr;
            if(curr.val>val){
                curr = curr.left;
            }
            else{curr = curr.right;}
        }
        if(parent.val>val){parent.left=ins;}
        else{parent.right=ins;}
        return root;
        
    }
}
