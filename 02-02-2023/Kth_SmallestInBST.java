
class Solution {
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> li = new ArrayList<>();
        inorder(root,li);
        return li.get(k-1);
        
    }
    public void inorder(TreeNode root, ArrayList<Integer> li){
        if(root==null) return;
        inorder(root.left,li);
        li.add(root.val);
        inorder(root.right,li);

    }
}
