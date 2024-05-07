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
    public int height(TreeNode root){
        if(root==null){
            return 0;
        }
        int left=height(root.left);
            int right=height(root.right);
        int ans=Math.max(left,right)+1;
        
        
        return ans;
    }
    public boolean isBalanced(TreeNode root) {
        if(root==null){
            return true;
        }
        boolean left=isBalanced(root.left);
        boolean right=isBalanced(root.right);
        boolean diff=Math.abs(height(root.left)-height(root.right))<=1;
        if(left && right && diff){
            return true;
        }
        else{
            return false;
        }
        
     
    }
}