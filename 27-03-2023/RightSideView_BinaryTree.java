class Solution {

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> lis = new ArrayList<Integer>();
        if(root==null){return lis;}
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!(queue.isEmpty())){

            int siz = queue.size();
            for(int i=1;i<=siz;i++){
                TreeNode curr = queue.poll();
                if(i==siz){
                lis.add(curr.val);}
                if(curr.left!=null){
                    queue.add(curr.left);
                }
                if(curr.right!=null){
                    queue.add(curr.right);
                }

            }
        }
        return lis;

        
    }
}
