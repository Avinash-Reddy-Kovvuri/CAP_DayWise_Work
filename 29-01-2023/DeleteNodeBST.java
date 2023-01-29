class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null){return null;}
        TreeNode parent = null;
        TreeNode cur = root;
        while(cur.val != key){
            parent = cur;
            if(cur.val>key) cur = cur.left;
            else cur = cur.right;
            if(cur==null) return root;
        }
        if(cur.left != null && cur.right != null){
            parent = cur;
            TreeNode t = cur.left;
            while(t.right != null){
                parent = t;
                t = t.right;
            }
            int tem = cur.val;
            cur.val = t.val;
            t.val = tem;
            cur = t;

        }
        if(cur.left==null && cur.right == null){
            if(parent==null){return null;}
            if(parent.left != null && parent.left==cur){
                parent.left = null;
            }
            else{
                parent.right = null;
            }
        }
        else if(cur.val==key){
            if(parent==null){
                if(cur.left != null){root=cur.left;}
                else{root=cur.right;}
            }
            else{
                if(parent.left==cur){
                    if(cur.left != null){
                        parent.left = cur.left;
                    }
                    else{parent.left = cur.right;}
                }
                else{
                    if(cur.left != null){
                        parent.right = cur.left;
                    }
                    else{parent.right = cur.right;}

                }
            }

        }
        return root;        
    }
}
