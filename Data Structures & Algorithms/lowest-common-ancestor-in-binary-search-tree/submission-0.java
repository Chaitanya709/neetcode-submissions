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

    public TreeNode func(TreeNode r, TreeNode p, TreeNode q){

        if( r == null) return r;

        if(p.val < r.val && q.val < r.val) return func(r.left,p,q);

        else if(p.val > r.val && q.val > r.val) return func(r.right,p,q);

        else return r;
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        return func(root,p,q);
    }
}
