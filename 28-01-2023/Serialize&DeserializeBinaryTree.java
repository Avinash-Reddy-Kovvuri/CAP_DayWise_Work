public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root==null){return null;}
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        String s ="";
        queue.add(root);
        s+=String.valueOf(root.val)+"@";
        while(!(queue.isEmpty())){
            int siz = queue.size();
            for(int i=1;i<=siz;i++){
            TreeNode rot = queue.poll();
            if(rot.left != null){
                    s+=String.valueOf(rot.left.val);
                    s+="@";
                    queue.add(rot.left);}
            else{s+="$";s+="@";}
            if(rot.right != null){
                    s+=String.valueOf(rot.right.val);
                    s+="@";
                    queue.add(rot.right);}
            else{s+="$";s+="@";}
        }}
        int i=s.length()-2;
        for(;i>=0;i-=2){
            char c = s.charAt(i);
            if(c!='$'){break;}
        }
        s= s.substring(0,i+1);
        return s; 
        }
               
    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data==null){return null;}
        String [] ss = data.split("@");
        ArrayList<Integer> data1 = new ArrayList<>();
        int a = Integer.MAX_VALUE;
        for(int i=0;i<ss.length;i++){
            String c = ss[i];
            if(c.equals("$")){data1.add(a);}
            else if(c.charAt(0)=='-'){
                data1.add(-1*Integer.parseInt(c.substring(1,c.length())));
            }
            else{data1.add(Integer.parseInt(c));}

        }
        Queue<TreeNode> queue1 = new LinkedList<TreeNode>();
        
        int index=0;
        queue1.add(new TreeNode((int)data1.get(index++)));
        int sizzz = data1.size();
        TreeNode root = queue1.peek();
        while(queue1.size()!=0 && index<sizzz){
            int siz = queue1.size();
            for(int i=0;i<siz;i++){
                TreeNode rot = queue1.poll();
                if(index<sizzz){
                if(data1.get(index)!=a){
                    int lef = data1.get(index);
                TreeNode leff = new TreeNode(lef);
                    queue1.add(leff);
                    rot.left=leff;
                }
                else{rot.left=null;}
                index+=1;
                }
                if(index<sizzz){
                if(data1.get(index)!=a){
                    int rig = data1.get(index);
                TreeNode rigg = new TreeNode(rig);
                    queue1.add(rigg);
                    rot.right=rigg;
                }
                else{rot.right=null;}
                index+=1;
                }

                
                
            }
        }
        return root;
    }
}
