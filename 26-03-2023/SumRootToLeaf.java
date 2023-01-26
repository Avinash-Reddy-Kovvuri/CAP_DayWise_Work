class Solution {
    // int sum=0;
    int res=0;
    public int find(TreeNode root,int sum){
        if(root==null){return 0;}
        sum = sum*10+root.val;
        if(root.left==null && root.right==null){
            res+=sum;
        }
        find(root.left,sum);
        find(root.right,sum);

        return 0;
        
    }
    public int sumNumbers(TreeNode root) {
            find(root,0);
            return res;



        
    }
}
