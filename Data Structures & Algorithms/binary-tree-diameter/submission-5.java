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
    int d = 0;
    public int depth(TreeNode root){

        if(root == null) return 0;

        int right = depth(root.right);
        int left = depth(root.left);

        d = Math.max(d, left + right);

        return Math.max(right,left)+1;
    }
    
    public int diameterOfBinaryTree(TreeNode root) {
        depth(root);
        return d;
    }
}
