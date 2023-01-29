class Tree
{
    //Function to return list containing elements of left view of binary tree.
    ArrayList<Integer> leftView(Node root)
    {
      // Your code here
      ArrayList<Integer> lis = new ArrayList<>();
      if(root==null) return lis;
      Queue<Node> queue = new LinkedList<>();
      queue.add(root);
      while(!(queue.isEmpty())){
          int siz = queue.size();
          for(int i=0;i<siz;i++){
              Node cur = queue.poll();
              if(i==0){lis.add(cur.data);}
              if(cur.left != null){
                  queue.add(cur.left);
              }
              if(cur.right != null){
                  queue.add(cur.right);
              }
              
          }
      }
      return lis;
      
    }
}
