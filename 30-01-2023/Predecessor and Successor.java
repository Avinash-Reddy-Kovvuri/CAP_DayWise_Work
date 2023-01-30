class GfG
{
    public static void findPreSuc(Node root, Res p, Res s, int key)
    {
       // add your code here
       p.pre = null;
       s.succ = null;
       if(root==null) return;
       while(root.data != key){
           if(root.data>key){
               s.succ = root;
               root = root.left;
           }
           else{
               p.pre = root;
               root = root.right;
           }
           if(root==null){return;}
       }
       if(root.data==key){
           Node root1 = root;
           if(root1.right != null){
               root1 = root1.right;
               s.succ = root1;
           }
           while(root1.left != null){
               root1 = root1.left;
               s.succ = root1;
           }
           if(root.left != null){
               root = root.left;
               p.pre = root;
           }
           while(root.left != null){
               root = root.right;
               p.pre = root;
           }
       }
       return ;
    }
}
