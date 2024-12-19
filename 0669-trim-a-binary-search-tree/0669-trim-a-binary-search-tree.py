class Solution:
    def trimBST(self, root: Optional[TreeNode], low: int, high: int) -> Optional[TreeNode]:
        if root:
            if root.val<low:
                return self.trimBST(root.right,low,high)
            elif high<root.val:
                return self.trimBST(root.left,low,high)
            root.left = self.trimBST(root.left,low,high)
            root.right = self.trimBST(root.right,low,high)
            return root
        return None