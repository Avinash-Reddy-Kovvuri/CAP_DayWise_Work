class Solution {
    
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        
        return cons(postorder,0,inorder.length-1,map,new int[] {postorder.length-1});

    }
    public TreeNode cons(int [] postorder,int left,int right,HashMap<Integer,Integer> map,int[] index){
        if(left>right) return null;
        int data = postorder[index[0]];
        index[0]-=1;
        TreeNode root = new TreeNode(data);
        root.right = cons(postorder,map.get(data)+1,right,map,index);
        root.left = cons(postorder,left,map.get(data)-1,map,index);
        
        return root;
    }
}
