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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList();
        Stack<TreeNode> stack = new Stack();
        
        stack.push(root);
        while(!stack.isEmpty())
        {
            TreeNode current = stack.pop();
            if(current != null)
            {
                result.add(current.val);
                stack.push(current.right);
                stack.push(current.left);
            }
        }
        return result;
    }
}