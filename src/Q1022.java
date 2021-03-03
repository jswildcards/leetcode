public class Q1022 {
    int r(TreeNode n, int p) {
        int t = p << 1 | n.val;

        if (n.left == null && n.right == null)
            return t;

        int l = n.left == null ? 0 : r(n.left, t);
        int r = n.right == null ? 0 : r(n.right, t);
        return l + r;
    }

    public int sumRootToLeaf(TreeNode n) {
        return r(n, 0);
    }
}

/*

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

 */
