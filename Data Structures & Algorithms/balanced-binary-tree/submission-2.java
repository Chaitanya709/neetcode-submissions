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

    public int dfs(TreeNode root){

        if(root == null) return 0;

        int lh = dfs(root.left);
        if(lh == -1) return -1;  //flag to check if each subtree is balanced or not

        int rh = dfs(root.right);
        if(rh == -1) return -1;

        if(Math.abs(rh - lh)>1) return -1;

        return 1 + Math.max(lh,rh);
    }
    public boolean isBalanced(TreeNode root) {

        return dfs(root) != -1;
        
    }
}
