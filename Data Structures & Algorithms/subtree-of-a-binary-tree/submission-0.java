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

  public boolean isSubtree(TreeNode root, TreeNode sub) {
        if(sub == null) return true;
        if (root == null) return false;
        if (root.val == sub.val) {
            if (same(root, sub) == 0) return true;  
        }
        // keep searching in left and right subtrees
        return isSubtree(root.left, sub) || isSubtree(root.right, sub);
    }

    public int same(TreeNode p, TreeNode q) {
        if (p == null && q == null) return 0;
        if (p == null || q == null) return -1;
        if (p.val != q.val) return -1;
        if (same(p.left, q.left) != 0) return -1;
        if (same(p.right, q.right) != 0) return -1;
        return 0;
    }
}
