public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        String s = "";
        if(root==null) return s;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode cur = queue.poll();
            s+=String.valueOf(cur.val)+"#";
            if(cur.left != null) queue.add(cur.left);
            else s+="@"+"#";
            if(cur.right != null) queue.add(cur.right);
            else s+="@"+"#";
        }
        return s;

        
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data.length()==0) return null;
        String [] s = data.split("#");
        Queue<TreeNode> queue = new LinkedList<>();
        ArrayList<TreeNode> li = new ArrayList<>();
        for(int i=0;i<s.length;i++){
            String c = s[i];
            if(c.equals("@")) li.add(null);
            else li.add(new TreeNode(Integer.parseInt(s[i])));
        }
        int index=0;
        queue.add(li.get(index++));
        TreeNode root = queue.peek();
        System.out.println(li);
        while(!queue.isEmpty()&& index<li.size()){
                TreeNode cur = queue.poll();
                TreeNode lf = li.get(index++);
                TreeNode rf = li.get(index++);
                if(lf!=null) {cur.left = lf;queue.add(lf);}
                else{cur.left=null;}
                if(rf!=null) {cur.right = rf;queue.add(rf);}
                else{cur.right=null;}
                                
            
        }
        return root;
        
    }
}
