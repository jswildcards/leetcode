public class Q0617 {
    public TreeNode mergeTrees(TreeNode p, TreeNode q) {
        if(p == null)
            return q;

        if(q != null) {
            p.val += q.val;
            p.left = mergeTrees(p.left, q.left);
            p.right = mergeTrees(p.right, q.right);
        }

        return p;
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
