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
    static int result;
    public int averageOfSubtree(TreeNode root) {
        result=0;
        func(root);
        return result;
    }
    static int[] func(TreeNode root){
        if(root==null){
            return new int[] {0,0};
        }
        int[] left = func(root.left);
        int[] right = func(root.right);
        int totalsum = left[0]+right[0]+root.val;
        int totalcount = 1+left[1]+right[1];
        if((totalsum/totalcount)==root.val){
            result++;
        }
        return new int[] {totalsum,totalcount};
    }
}