class Solution {
    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        return buildTree(preorder, postorder, 0, 0, preorder.length);
    }

      public  TreeNode buildTree(int[] preorder, int[] postorder, int preStart, int postStart, int size) {
        if (size == 0) {
            return null;
        }

         TreeNode root = new TreeNode(preorder[preStart]);
        if (size == 1) {
            return root;
        }

       

        int leftSize = 0;
        for (int i = postStart; i < postorder.length-1; i++) {
            if (postorder[i] == preorder[preStart + 1]) {
                leftSize = i - postStart + 1;
                break;
            }
        }

       
        root.left = buildTree(preorder, postorder, preStart + 1, postStart, leftSize);
        root.right = buildTree(preorder, postorder, preStart + 1 + leftSize, postStart + leftSize, size - 1 - leftSize);

        return root;
    }
}
