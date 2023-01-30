class GFG
{
    public static Node constructTree(int post[],int n)
    {
        //Add your code here.
        int upper = Integer.MIN_VALUE;
        return constr(post,upper,new int[] {post.length-1});
    }
    public static Node constr(int[] post,int upper,int [] index){
        if(index[0]==-1 || post[index[0]]<upper) return null;
        
        Node root = new Node(post[index[0]--]);
        root.right = constr(post,root.data,index);
        root.left = constr(post,upper,index);
        return root;
        
    }
}
