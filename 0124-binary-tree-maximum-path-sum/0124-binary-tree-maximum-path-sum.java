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
    public int maxPathSum(TreeNode root) {
        int[] max = new int[1];
        max[0]=Integer.MIN_VALUE;
        maxpath(root,max);
        return max[0];

    }
    private int maxpath(TreeNode root,int maxvalue[]){
        if(root==null){
            return 0;
        }
        int leftsum=Math.max(0,maxpath(root.left,maxvalue));
        int rightsum=Math.max(0,maxpath(root.right,maxvalue));
        maxvalue[0]=Math.max(maxvalue[0],root.val+leftsum+rightsum);
        return root.val+Math.max(leftsum,rightsum);
    }
}