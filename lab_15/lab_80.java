class tas {
    public boolean isSymmetric(TreeNode root) {
        // A null tree is symmetric
        if (root == null)
            return true;
        // Use a helper function to compare the left and right subtrees
        return isSame(root.left, root.right);
    }

    private boolean isSame(TreeNode p, TreeNode q) {

        if (p == null && q == null)
            return true;

        if (p == null || q == null)
            return false;
        if (p.val == q.val) {
            if (isSame(p.left, q.right) && isSame(p.right, q.left))
                return true;
        }

        return false;
    }
}
