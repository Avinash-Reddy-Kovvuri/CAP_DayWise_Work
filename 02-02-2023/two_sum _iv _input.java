class BSTIrt{

    private Stack<TreeNode> stack = new Stack<>();
    boolean reverse=false;
    BSTIrt(TreeNode root,boolean revers){
        reverse = revers;
        System.out.println(reverse);
        pushAll(root);
    }
    boolean hasNext(){
        return (!stack.isEmpty());
    }
    public int next(){

        TreeNode cur = stack.pop();
        if(reverse==true) pushAll(cur.left);
        else pushAll(cur.right);
        return cur.val;
    }
    public void pushAll(TreeNode root){
        while(root != null){
            stack.push(root);
            if(reverse==true){
                
                root = root.right;
            }
            else{
                root = root.left;
            }
        }
    }
}
class Solution {
    public boolean findTarget(TreeNode root, int k) {
        BSTIrt i = new BSTIrt(root,false);
        BSTIrt j = new BSTIrt(root,true);
        int a = i.next(),b = j.next();
        while(b>a){
            
            if(a+b==k) return true;
            else if(a+b>k) b = j.next();
            else a=i.next();
        }
        return false;


        
}
}
