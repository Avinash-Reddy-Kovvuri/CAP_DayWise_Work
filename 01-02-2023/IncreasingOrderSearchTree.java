class Solution {
    ArrayList<Integer> li = new ArrayList<Integer>();
    public TreeNode increasingBST(TreeNode root) {
        
        inorder(root);
        Collections.sort(li);
        System.out.println(li);
        TreeNode root1 = new TreeNode(li.get(0));
        TreeNode roo2 = root1;
        for(int i=1;i<li.size();i++){
            root1.right = new TreeNode(li.get(i));
            root1 = root1.right;

        }
        return roo2;

    }
    public void inorder(TreeNode root){
        if(root == null) return;
            inorder(root.left);
            li.add(root.val);
            inorder(root.right);
    }
}
