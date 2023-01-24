class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
                List<Integer> list = new ArrayList<Integer>();
        preorder(list,root);
        return list;
       
    }
    public void preorder(List<Integer> lis ,TreeNode node){
        if(node != null){
            
            lis.add(node.val);
            preorder(lis,node.left);
            preorder(lis,node.right);
        }
    }
        
    }
