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
/*
108. Convert Sorted Array to Binary Search Tree
Easy

7020

379

Add to List

Share
Given an integer array nums where the elements are sorted in ascending order, convert it to a height-balanced binary search tree.

A height-balanced binary tree is a binary tree in which the depth of the two subtrees of every node never differs by more than one.

Input: nums = [-10,-3,0,5,9]
Output: [0,-3,9,-10,null,5]
Explanation: [0,-10,5,null,-3,null,9] is also accepted:
*/


class Solution {
  public TreeNode sortedArrayToBST(int[] nums) {
    return helper(nums, 0, nums.length - 1);
  }
  
  private TreeNode helper(int[] nums, int start, int end) {
    if (start > end) {
      return null;
    }
    int mid = (start + end) / 2;
    TreeNode root = new TreeNode(nums[mid]);
    root.left = helper(nums, start, mid - 1);
    root.right = helper(nums, mid + 1, end);
    return root;
  }
}
