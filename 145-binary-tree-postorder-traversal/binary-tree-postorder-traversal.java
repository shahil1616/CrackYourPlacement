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
    public List<Integer> postorderTraversal(TreeNode root) {
          List<Integer> list = new ArrayList<>();
if(root== null)
        return list;
        transversal(root,list);
        return list;

        
        
    }
        public void transversal(TreeNode root,List<Integer> list)
    {
        if(root==null)
        return ;
        
        transversal(root.left,list);
        transversal(root.right,list);
        list.add(root.val);
    }

}