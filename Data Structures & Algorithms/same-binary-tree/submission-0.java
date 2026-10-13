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

    public int same(TreeNode p, TreeNode q){

        if(p == null && q == null) return 0;
        if(p == null || q == null) return -1;
        
        if(p.val != q.val) return -1;

        if (same(p.left, q.left) != 0) return -1;
        if (same(p.right, q.right) != 0) return -1;

        return 0;
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        
        return same(p,q) !=-1;
    }
}
