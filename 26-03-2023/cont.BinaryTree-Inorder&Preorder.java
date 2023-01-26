class Solution {
    int index;
    HashMap <Integer, Integer> inomap = new HashMap <Integer, Integer>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        
        index=0;
        for(int i=0;i<inorder.length;i++){
            inomap.put(inorder[i],i);
        }
        return find(preorder,0,preorder.length-1);
        
    }
    public TreeNode find(int[] preorder,int lef,int righ){
        if(lef>righ){return null;}
        int val = preorder[index];
        index+=1;
        TreeNode root = new TreeNode(val);
        root.left = find(preorder,lef,inomap.get(val)-1);
        root.right = find(preorder,inomap.get(val)+1,righ);
        return root;
    }

