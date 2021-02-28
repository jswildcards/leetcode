public class Q0897 {
    TreeNode c;

    public TreeNode increasingBST(TreeNode r) {
        TreeNode a = new TreeNode(0);
        c = a;
        inorder(r);
        return a.right;
    }

    public void inorder(TreeNode n) {
        if (n == null) return;
        inorder(n.left);
        n.left = null;
        c.right = n;
        c = n;
        inorder(n.right);
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
