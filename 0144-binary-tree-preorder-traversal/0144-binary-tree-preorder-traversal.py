# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def preorder(self,ans,node):
        if node is None:
            return 
        ans.append(node.val)
        self.preorder(ans,node.left)
        self.preorder(ans,node.right)
        
    def preorderTraversal(self, root: Optional[TreeNode]) -> List[int]:
        ans =[]
        self.preorder(ans,root)
        return ans
        