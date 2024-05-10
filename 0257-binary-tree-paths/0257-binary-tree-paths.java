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
import java.util.*;

class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<>(); // List to store paths
        
        if (root == null) {
            return paths; // Return empty list if root is null
        }
        
        // Base case: if the node is a leaf (no left or right child)
        if (root.left == null && root.right == null) {
            paths.add(String.valueOf(root.val)); // Add the current node value as a path
            return paths;
        }
        
        // Recursive case: for non-leaf nodes
        List<String> leftPaths = binaryTreePaths(root.left); // Recursively find paths in the left subtree
        for (String path : leftPaths) {
            paths.add(root.val + "->" + path); // Add current node value and concatenate with left subtree paths
        }
        
        List<String> rightPaths = binaryTreePaths(root.right); // Recursively find paths in the right subtree
        for (String path : rightPaths) {
            paths.add(root.val + "->" + path); // Add current node value and concatenate with right subtree paths
        }
        
        return paths; // Return all paths
    }
}
