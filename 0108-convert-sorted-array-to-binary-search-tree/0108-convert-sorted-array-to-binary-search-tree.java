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
    public TreeNode sortedArrayToBST(int[] nums) {
        return insert(nums,0,nums.length-1);
    }
    public TreeNode insert(int nums[],int l,int r){
        if(l>r)
            return null;
        else{
            int mid=(l+r)/2;
            TreeNode node=new TreeNode(nums[mid]);
            node.left=insert(nums,l,mid-1);
            node.right=insert(nums,mid+1,r);
            return node;
        }
    }
}