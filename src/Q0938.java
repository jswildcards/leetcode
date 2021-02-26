public class Q0938 {
    public int rangeSumBST(TreeNode r, int l, int h) {
        int a = 0;

        if (r == null)
            return a;

        if (l <= r.val && r.val <= h)
            a += r.val;

        if (l < r.val)
            a += rangeSumBST(r.left, l, h);

        if (r.val < h)
            a += rangeSumBST(r.right, l, h);

        return a;
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
