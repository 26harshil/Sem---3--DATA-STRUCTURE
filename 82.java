import java.util.*;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
 
      

       TreeNode root ;


       if(preorder[0]==postorder[postorder.length-1])
         root= new TreeNode(preorder[0]);
    

         ArrayList<Integer> left = new ArrayList<>();
         ArrayList<Integer> right = new ArrayList<>();
        for(int j=1; j!=preorder[j];j++){
                left.add(postorder[j]);
        }
        root.left=buildTree( left);

        for(int i=preorder[1]; i!=preorder.length-1; i++ ){
                  right.add(postorder[i]);
        }
        root.right=buildTree(right);

        return root;
    }

    public TreeNode buildTree(ArrayList<Integer> nodes) {
     
   

        TreeNode newNode = new TreeNode(nodes.remove());
        newNode.left = buildTree(nodes);
        newNode.right = buildTree(nodes);
        return newNode;
    }
   
}
