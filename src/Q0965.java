public class Q0965 {
    boolean r(TreeNode n, int p) {
        if(n == null)
            return true;

        return n.val == p && r(n.left, p) && r(n.right, p);
    }

    public boolean isUnivalTree(TreeNode n) {
        return r(n, n.val);
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
