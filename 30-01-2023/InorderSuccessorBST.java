class Solution
{
    // returns the inorder successor of the Node x in BST (rooted at 'root')
	public Node inorderSuccessor(Node root,Node x)
         {
          //add code here.
          Node suc = null;
          while(root.data != x.data){
              if(root.data>x.data){
                  suc = root;
                  root = root.left;
              }
              else{
                  root = root.right;
              }
          }
          if(root.data==x.data && root.right != null){
              
                suc = root.right;
                root = root.right;
                while(root.left != null){
                    suc = root.left;
                    root = root.left;
                }
              
          }
          return suc;
         }
}
