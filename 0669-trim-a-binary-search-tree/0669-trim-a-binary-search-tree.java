/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode trimBST(TreeNode root, int low, int high) {
        if(root==null)
        {
            return null;
        }
        else if((int)root.val<low)
        {
            // root.left=null;
            
            return trimBST(root.right,low,high);
        }
        else if((int)high<root.val)
        {
            // root.right=null;
            
            return trimBST(root.left,low,high);
        }
        else
        {
            root.left=trimBST(root.left,low,high);
            root.right=trimBST(root.right,low,high);
            return root;

        }
    }
}