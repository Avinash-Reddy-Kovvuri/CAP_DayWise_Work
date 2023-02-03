class Solution {
    public TreeNode sortedListToBST(ListNode head) {

        ArrayList<Integer> li = new ArrayList<>();
        while(head != null){
            li.add(head.val);
            head = head.next;
        }
        return set(li,0,li.size()-1);
        
    }
    public TreeNode set(ArrayList<Integer> li,int left,int right){
        if(left>right) return null;
        int mid = (left+right)/2;
        TreeNode root = new TreeNode(li.get(mid));
        root.left = set(li,left,mid-1);
        root.right = set(li,mid+1,right);
        return root;
    }

}
