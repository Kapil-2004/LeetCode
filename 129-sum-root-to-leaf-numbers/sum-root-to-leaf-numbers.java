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
    static int sum=0;
    public int sumNumbers(TreeNode root) {
        sum=0;
        path(root , 0);
        return sum;
    }

    public void path(TreeNode root , int num ){
        if(root == null){
            return ;
        }
        num = num*10 + root.val;
        if(root.left == null && root.right == null){
            sum += num;
        }
        path(root.left , num);
        path(root.right , num);
    }
}