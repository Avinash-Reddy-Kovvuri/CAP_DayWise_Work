class Solution {
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> li = new ArrayList<Integer>();
        inorder(root1,li);
        inorder(root2,li);
        Collections.sort(li);
        return li;
        
    }
    public void inorder(TreeNode root,List<Integer> li){
        if(root==null) return;
        inorder(root.left,li);
        li.add(root.val);
        inorder(root.right,li);

    }
}
