class Tree {
    // Function to return the ceil of given number in BST.
    int floor = Integer.MIN_VALUE;
    int findFloor(Node root, int key) {
        if (root == null) return -1;
        // Code here
        if(root.data>key){
            findCeil(root.left,key);
        }
        if(root.data<=key){
            floor = root.data;
            findCeil(root.right,key);
        }
        if(floor==Integer.MIN_VALUE){return -1;}
        return floor;
    }
}
