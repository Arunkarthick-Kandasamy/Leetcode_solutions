class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        TreeNode result=new TreeNode();
        result=root;
        while(result!=null)
        {
            System.out.println(result.val);
            if(result.val==val)
            {
                return result;
            }
            else if(result.val>val)
            {
                result=result.left;
            }
            else
            {
                result=result.right;
            }
        }
        return result;

    }
}