class Solution {
    class Sample{
        
        TreeNode root;
        int row,col;

        Sample(TreeNode roo,int ro,int co){
            root = roo;
            row = ro;
            col = co;
        }
    }
    public List<List<Integer>> verticalTraversal(TreeNode root) {

        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(root==null) return res;
        Queue<Sample> queue = new LinkedList<>();
        TreeMap<Integer,TreeMap<Integer,PriorityQueue<Integer>>> map = new TreeMap<Integer,TreeMap<Integer,PriorityQueue<Integer>>>();

        queue.add(new Sample(root,0,0));
        while(!(queue.isEmpty())){
                Sample v = queue.poll();
                TreeNode cur = v.root;
                int row = v.row;
                int col = v.col;

                if(!map.containsKey(row)){
                map.put(row, new TreeMap<>());}
                if(!map.get(row).containsKey(col)){
                map.get(row).put(col, new PriorityQueue<>());}

                map.get(row).get(col).add(cur.val);
            
                if(cur.left != null)
                    queue.add(new Sample(cur.left,row-1,col+1));
                if(cur.right != null)
                    queue.add(new Sample(cur.right,row+1,col+1));


        }
        for(TreeMap<Integer,PriorityQueue<Integer>> v : map.values()){
            ArrayList<Integer> li = new ArrayList<>();
            for(PriorityQueue<Integer> n : v.values()){
                int size = n.size();
                for(int i=0;i<size;i++)
                li.add(n.poll());
                
            }
        
            res.add(li);
        }
        return res;
    }
}
