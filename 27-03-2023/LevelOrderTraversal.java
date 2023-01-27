class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root==null){return res;} 
        Queue<TreeNode> queue = new LinkedList<>();             
        queue.add(root);
        while(queue.size() != 0){
            List<Integer> lis1 = new ArrayList<Integer>();
            int siz = queue.size();
            for(int i=0;i<siz;i++){
                TreeNode curr = queue.poll();
                lis1.add(curr.val);
                if(curr.left!= null){
                        queue.add(curr.left);
                }
                if(curr.right!=null){
                    queue.add(curr.right);     
                }              
            }
            res.add(lis1);                   
        }
        return res;
    }
}
