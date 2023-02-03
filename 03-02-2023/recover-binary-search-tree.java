class Solution {

    public void recoverTree(TreeNode root) {
        ArrayList<TreeNode> li = new ArrayList<>();
        inorder(root,li);
        TreeNode first=null,second=null;

        for(int i=0;i<li.size()-1;i++){
            System.out.println(li.get(i).val);
            if(li.get(i).val > li.get(i+1).val){
                if(first==null) {
                    first=li.get(i);
                    second = li.get(i+1);}
                else second=li.get(i+1);
            }
        }
        
            System.out.println(first.val);
            System.out.println(second.val);
            int k = first.val;
            first.val = second.val;
            second.val = k;   
    }
    public void inorder(TreeNode root,ArrayList<TreeNode> li){
        if(root==null) return;
        inorder(root.left,li);
        li.add(root);
        inorder(root.right,li);
    }
}
