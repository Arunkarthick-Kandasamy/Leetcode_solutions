class Solution {
    public int maxDepth(TreeNode root) {
        if(root==null)
        {
            return 0;
        }
        int l=maxDepth(root.left);
        int r =maxDepth(root.right);
        if(l<r)
        {
            return 1 + r;
        }
        return 1+l;
         
    }
}