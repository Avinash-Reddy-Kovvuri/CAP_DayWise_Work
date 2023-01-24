class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
                        List<Integer> list = new ArrayList<Integer>();
        postorder(list,root);
        return list;
       
    }
    public void postorder(List<Integer> lis ,TreeNode node){
        if(node != null){
            
            
            postorder(lis,node.left);
            postorder(lis,node.right);
            lis.add(node.val);
        }
    }
        
    }
