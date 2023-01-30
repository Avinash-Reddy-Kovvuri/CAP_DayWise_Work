class Solution {

    class Sample{
        TreeNode node;
        int ofse;
        Sample(TreeNode node,int ofse){
            this.node = node;
            this.ofse = ofse;
        }
    }
    public int widthOfBinaryTree(TreeNode root) {
        if(root==null){return 0;}
        Queue<Sample> queue = new LinkedList<>();
        queue.add(new Sample(root,0));
        int res=0;
        while(!(queue.isEmpty())){
            int siz = queue.size();
            int lef=0,rig=0;
            for(int i=0;i<siz;i++){
                TreeNode root1 = queue.peek().node;
                int of =  queue.peek().ofse;
                queue.poll();
                if(i==0) lef=of;
                if(i==siz-1) rig=of;
                if(root1.left!=null){
                    queue.add(new Sample(root1.left,2*of+1));
                }
                if(root1.right != null){
                    queue.add(new Sample(root1.right,2*of+2));
                }               
            }
            res = Math.max(res,rig-lef+1);
        }
        return res;       
}
}
