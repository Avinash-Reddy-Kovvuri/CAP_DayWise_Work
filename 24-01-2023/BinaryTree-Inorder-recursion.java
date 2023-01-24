class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        inorder(list,root);
        return list;
       
    }
    public void inorder(List<Integer> lis ,TreeNode node){
        if(node != null){
            inorder(lis,node.left);
            lis.add(node.val);
            inorder(lis,node.right);
        }
    }
}
