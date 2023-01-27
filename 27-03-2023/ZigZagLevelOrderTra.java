class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(root==null){return res;}
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        stack1.push(root);
        boolean bool = false;
        while(!(stack1.isEmpty()) || !(stack2.isEmpty())){
            List<Integer> lis = new ArrayList<>();
            int siz1 = stack1.size();
            for(int i=0;i<siz1;i++){
                TreeNode v = (stack1.pop());
                stack2.push(v);
                if(bool){
                lis.add(v.val);}
            }
            int siz2 = stack2.size();
            for(int j=0;j<siz2;j++){
                TreeNode vv = (stack2.pop());
                if(!(bool)){
                lis.add(vv.val);}
                if(vv.left != null){stack1.push(vv.left);}
                if(vv.right != null){stack1.push(vv.right);}
            }
            bool=!(bool);
            res.add(lis);
        }
        return res;    
    }
}
