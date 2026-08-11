// Last updated: 8/11/2026, 2:21:38 PM
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
    int count=0;
    public int countDominantNodes(TreeNode root) {
        findMax(root);
        return count;
    }

    private int findMax(TreeNode node){
        if(node == null)
            return Integer.MIN_VALUE;

        int left =findMax(node.left);
        int right =findMax(node.right);
        

        int max = Math.max(node.val, Math.max(left,right));

        if(node.val == max)
            count++;

        return max;
    }
    }
