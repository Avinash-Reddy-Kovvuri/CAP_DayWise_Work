class Solution
{
    
    static ArrayList<Integer> topView(Node root)
    {
        // add your code
        ArrayList<Integer> lis = new ArrayList<>();
        if(root==null) return lis;
        class Sample{
            Node node;
            int offset;
            Sample(Node node,int offset){
                this.node = node;
                this.offset = offset;
            }
        }
        TreeMap<Integer,Integer> tree_map = new TreeMap<>();
        Queue<Sample> queue = new LinkedList<>();
        queue.add(new Sample(root,0));
        while(!(queue.isEmpty())){
            int siz = queue.size();
            for(int i=0;i<siz;i++){
                Sample n = queue.poll();
                Node curr = n.node;
                int ofset = n.offset;
                if(!(tree_map.containsKey(ofset))){
                    tree_map.put(ofset,curr.data);
                }
                if(curr.left != null){
                    queue.add(new Sample(curr.left,ofset-1));
                }
                if(curr.right != null){
                    queue.add(new Sample(curr.right,ofset+1));
                }
            }
        }
        
        for(Map.Entry<Integer,Integer> entry:tree_map.entrySet()){
        lis.add(entry.getValue());}
      //System.out.println(lis);
        return lis;
        
        
    }
}
