public class Node{
    
    int data;
    Node left;
    Node right;
    
    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
    
    public int size(Node node){
        
        if(node==null){return 0;}
        int left = size(node.left);
        int right = size(node.right);
        
        return left+right+1;
    }
    public int san(Node node){ // sum of all nodes
        
        if(node==null){return 0;}
        int left = san(node.left);
        int right = san(node.right);
        
        return left+right+node.data;
    }
    public int height(Node node){
        if(node==null){return 0;}
        int left = height(node.left);
        int right = height(node.right);

        return Math.max(left,right)+1;
    }
    
}
