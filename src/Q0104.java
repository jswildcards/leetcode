public class Q0104 {
    public int maxDepth(TreeNode n) {
        if (n == null)
            return 0;

        return 1 + Math.max(maxDepth(n.left), maxDepth(n.right));
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
