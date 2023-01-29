class Tree {
    // Function to return the ceil of given number in BST.
    int ceil = Integer.MAX_VALUE;
    int findCeil(Node root, int key) {
        if (root == null) return -1;
        // Code here
        if(root.data>=key){
            ceil = root.data;
            findCeil(root.left,key);
        }
        if(root.data<key){
            findCeil(root.right,key);
        }
        if(ceil==Integer.MAX_VALUE){return -1;}
        return ceil;
    }
}
